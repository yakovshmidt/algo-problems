package kz.home.ys.algo.easy.backspaceStringCompare;

class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        int l = s.length() - 1;
        int r = t.length() - 1;
        int skipS = 0;
        int skipT = 0;
        
        while (l >= 0 || r >= 0) {
            while (l >= 0) {
                if (s.charAt(l) == '#') {
                    skipS++;
                    l--;
                } else if (skipS > 0) {
                    skipS--;
                    l--;
                } else break;
            }
            
            
            while (r >= 0) {
                if (t.charAt(r) == '#') {
                    skipT++;
                    r--;
                } else if (skipT > 0) {
                    skipT--;
                    r--;
                } else break;
            }
            
            if (l >= 0 && r >= 0 && s.charAt(l) != t.charAt(r)) {
                return false;
            }
            
            if ((l >= 0) != (r >= 0)) {
                return false;
            }
            
            l--;
            r--;
        }
        
        return true;
    }
}