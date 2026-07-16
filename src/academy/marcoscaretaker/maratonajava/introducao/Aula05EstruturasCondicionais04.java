package academy.marcoscaretaker.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        // taxes exercise
        // 0 - 34,712 taxes 9.7%
        // 34,713 - 68,507 taxes 37.35%
        // 68,508 taxes 49.5%
        double annualSalary = 43998;
        double annualSalaryAfterTaxes = 0;
        double totalTaxes = 0;
        double appliedRate;
        if(annualSalary > 0 && annualSalary <= 34712){
            appliedRate = 9.7;
            totalTaxes = annualSalary / 100 * appliedRate;
            annualSalaryAfterTaxes = annualSalary - totalTaxes;
        }else if(annualSalary >= 34713 && annualSalary <= 68507){
            appliedRate = 37.35;
            totalTaxes = annualSalary / 100 * appliedRate;
            annualSalaryAfterTaxes = annualSalary - totalTaxes;
        }else if(annualSalary >= 68508){
            appliedRate = 49.5;
            totalTaxes = annualSalary / 100 * appliedRate;
            annualSalaryAfterTaxes = annualSalary - totalTaxes;
        }else{
            annualSalaryAfterTaxes = 0;
            appliedRate = 0;
        }
        System.out.println("Starting salary R$"+annualSalary+" após taxa de:"+appliedRate+" o valor total é R$"+annualSalaryAfterTaxes+" total de valor em taxa R$"+totalTaxes);
    }
}
