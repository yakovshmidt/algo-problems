package kz.home.ys.algo.medium.designAuthenticationManager;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

class AuthenticationManager {

    private final int timeToLive;
    private final Map<String, Integer> tokenIdToExpirationTimeMap = new HashMap<>();
    private final TreeSet<Integer> expirationTimeSet = new TreeSet<>();

    public AuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
    }
    
    // time - O(1)
    public void generate(String tokenId, int currentTime) {
        int expirationTime = currentTime + timeToLive;
        tokenIdToExpirationTimeMap.put(tokenId, expirationTime);
        expirationTimeSet.add(expirationTime);
    }
    
    // time - O(N*log(N))
    public void renew(String tokenId, int currentTime) {
        Integer expirationTime = tokenIdToExpirationTimeMap.get(tokenId);
        
        if (expirationTime == null || currentTime >= expirationTime) return;
        
        int newExpirationTime = currentTime + timeToLive;
        tokenIdToExpirationTimeMap.put(tokenId, newExpirationTime);
        expirationTimeSet.remove(expirationTime);
        expirationTimeSet.add(newExpirationTime);

        while (!expirationTimeSet.isEmpty() && expirationTimeSet.lower(currentTime) != null) {
            expirationTimeSet.remove(expirationTimeSet.lower(currentTime));
        }
    }
    
    // time - O(1)
    public int countUnexpiredTokens(int currentTime) {
        return expirationTimeSet.tailSet(currentTime, false).size();
    }
}