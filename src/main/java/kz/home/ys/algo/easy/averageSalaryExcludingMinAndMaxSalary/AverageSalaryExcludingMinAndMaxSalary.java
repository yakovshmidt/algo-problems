package kz.home.ys.algo.easy.averageSalaryExcludingMinAndMaxSalary;

class AverageSalaryExcludingMinAndMaxSalary {
    
    public double average(int[] salary) {
        double sum = 0;
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        for (int currSalary : salary) {
            sum += currSalary;
            if (currSalary < min) {
                min = currSalary;
            }
            if (currSalary > max) {
                max = currSalary;
            }
        }

        return (sum - min - max) / (salary.length - 2);
    }
}