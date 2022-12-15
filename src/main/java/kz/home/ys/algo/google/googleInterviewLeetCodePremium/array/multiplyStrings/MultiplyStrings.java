package kz.home.ys.algo.google.googleInterviewLeetCodePremium.array.multiplyStrings;

import java.util.ArrayList;
import java.util.List;

class MultiplyStrings {

    // time - O(M^2 + N*M)
    // space - O(M * (N + M))
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        StringBuilder firstNumber = new StringBuilder(num1);
        StringBuilder secondNumber = new StringBuilder(num2);

        firstNumber.reverse();
        secondNumber.reverse();

        List<List<Integer>> digits = new ArrayList<>();
        for (int i = 0; i < secondNumber.length(); i++) {
            digits.add(multiplyOneDigit(firstNumber, secondNumber.charAt(i), i));
        }

        StringBuilder results = sumResults(digits);
        results.reverse();
        return results.toString();
    }

    private List<Integer> multiplyOneDigit(StringBuilder firstNumber, char secondNumberDigit, int numOfZeros) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < numOfZeros; i++) {
            result.add(0);
        }

        int carry = 0;
        for (int i = 0; i < firstNumber.length(); i++) {
            char firstNumberDigit = firstNumber.charAt(i);
            int multiplication = (firstNumberDigit - '0') * (secondNumberDigit - '0') + carry;

            carry = multiplication / 10;

            result.add(multiplication % 10);
        }

        if (carry != 0) {
            result.add(carry);
        }

        return result;
    }

    private StringBuilder sumResults(List<List<Integer>> results) {
        List<Integer> answer = new ArrayList<>(results.get(results.size() - 1));
        List<Integer> newAnswer;
        for (int j = 0; j < results.size() - 1; j++) {
            List<Integer> result = results.get(j);
            newAnswer = new ArrayList<>();
            int carry = 0;

            for (int i = 0; i < answer.size() || i < result.size(); i++) {
                int digit1 = i < result.size() ? result.get(i) : 0;
                int digit2 = i < answer.size() ? answer.get(i) : 0;
                int sum = digit1 + digit2 + carry;
                carry = sum / 10;
                newAnswer.add(sum % 10);
            }
            if (carry != 0) {
                newAnswer.add(carry);
            }
            answer = newAnswer;
        }
        StringBuilder finalAnswer = new StringBuilder();
        for (int digit : answer) {
            finalAnswer.append(digit);
        }
        return finalAnswer;
    }
}