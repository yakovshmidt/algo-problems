package kz.home.ys.algo.hard.splitMessageBasedOnLimit;

class SplitMessageBasedOnLimit {
    public String[] splitMessage(String message, int limit) {
        /*
        
        suffix can be at least - 5

        start = 1
        end = message.length
        
        Approach:
        * get mid
        * using the mid point we try to create the result
        * 

        */

        int m = message.length();
        int start = 0, end = m;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isValid(m, mid, limit)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return createSplitMessage(message, start + 1, limit);
    }

    private boolean isValid(int m, int target, int limit) {
        int currM = m;
        for (int i = 1; i <= target; i++) {
            int needed = 3 + String.valueOf(target).length() + String.valueOf(i).length();
            if (limit <= needed) return false;

            int used = limit - needed;
            currM -= used;
        }

        return currM <= 0;
    }

    private String[] createSplitMessage(String message, int total, int limit) {
        String[] result = new String[total + 1];
        int messageIdx = 0;
        for (int i = 1; i <= total + 1; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("<").append(i).append("/").append(total).append(">");

            int remaining = limit - sb.length();
            if (remaining <= 0) return new String[0];

            String splitMessage = message.substring(messageIdx, Math.min(messageIdx + remaining, message.length())) + sb;
            result[i - 1] = splitMessage;

            System.out.println(splitMessage);

            messageIdx += remaining;
        }
        return result;
    }
}