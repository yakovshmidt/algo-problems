package kz.home.ys.algo.google.easy.uniqueEmailAddresses;

import java.util.HashMap;
import java.util.Map;

class UniqueEmailAddresses {

    // time - O(N*M) - where N is emails length and M is max email length
    // space - O(N)
    public int numUniqueEmails(String[] emails) {
        /*
        
        Approach:
            1. iterate over emails
            2. get each email
                2.1 once we got email -> split before @, remove all ., substring everything after +
                2.2 add resulted local name with @ and domain name and count them via hashMap
                

        Approach 2:
            1. iterate over emails
            2. get each email
                2.1 modify email by regexp
                2.2 ---//----
        */

        Map<String, Integer> modifiedEmailsToCounts = new HashMap<>();

        for (String email : emails) {
            String[] splitEmailByAtSymbol = email.split("@");

            String localName = splitEmailByAtSymbol[0]; // a
            String domainName = splitEmailByAtSymbol[1]; // leetcode.com

            localName = localName.replaceAll("\\.", ""); // a
            int plusSymbolIdx = localName.indexOf('+'); // -1
            if (plusSymbolIdx != -1) {
                localName = localName.substring(0, plusSymbolIdx);
            }

            email = localName + "@" + domainName;
            modifiedEmailsToCounts.put(email, modifiedEmailsToCounts.getOrDefault(email, 0) + 1);
        }

        return modifiedEmailsToCounts.size();
    }
}
















