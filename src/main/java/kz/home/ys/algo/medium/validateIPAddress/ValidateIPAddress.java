package kz.home.ys.algo.medium.validateIPAddress;

class ValidateIPAddress {
    public String validIPAddress(String queryIP) {
        int dotsCount = 0;
        int colonsCount = 0;
        for (char ch : queryIP.toCharArray()) {
            if (ch == '.') dotsCount++;
            else if (ch == ':') colonsCount++;
        }
        if (dotsCount == 3 && isIPv4Address(queryIP)) return "IPv4";
        else if (colonsCount == 7 && isIPv6Address(queryIP)) return "IPv6";
        else return "Neither";
    }

    private boolean isIPv4Address(String queryIP) {
        String[] splitIPv4 = queryIP.split("\\.", -1);
        for (String part : splitIPv4) {
            if (part.length() == 0 || part.length() > 3) {
                return false;
            } else if (part.charAt(0) == '0' && part.length() != 1) {
                return false;
            } else {
                for (char ch : part.toCharArray()) {
                    if (!Character.isDigit(ch)) return false;
                }
                if (Integer.parseInt(part) > 255) return false;
            }
        }
        return true;
    }

    private boolean isIPv6Address(String queryIP) {
        String[] parts = queryIP.split(":", -1);
        String hexdigits = "0123456789abcdefABCDEF";
        for (String part : parts) {
            if (part.length() == 0 || part.length() > 4) return false;
            for (Character ch : part.toCharArray()) {
                if (hexdigits.indexOf(ch) == -1) return false;
            }
        }
        return true;
    }
}