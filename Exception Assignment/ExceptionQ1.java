package Diya_Web_assignments;

//Custom Exception Classes
class CountryNotValidException extends Exception 
{
 public CountryNotValidException(String message) 
 {
     super(message);
 }
}

class EmployeeNameInvalidException extends Exception 
{
 public EmployeeNameInvalidException(String message) 
 {
     super(message);
 }
}

class TaxNotEligibleException extends Exception 
{
 public TaxNotEligibleException(String message) 
 {
     super(message);
 }
}

//TaxCalculator Class
class TaxCalculator 
{
 public double calculateTax(String empName, boolean isIndian, double empSal)
         throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException 
 	 {
     if (!isIndian) 
     {
         throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
     }

     if (empName == null || empName.isEmpty()) 
     {
         throw new EmployeeNameInvalidException("The employee name cannot be empty");
     }

     double taxAmount;

     if (empSal > 100000) 
     {
         taxAmount = empSal * 8 / 100;
     } else if (empSal >= 50000 && empSal <= 100000)
     {
         taxAmount = empSal * 6 / 100;
     } else if (empSal >= 30000 && empSal < 50000) 
     {
         taxAmount = empSal * 5 / 100;
     } else if (empSal >= 10000 && empSal < 30000) 
     {
         taxAmount = empSal * 4 / 100;
     } else 
     {
         throw new TaxNotEligibleException("The employee does not need to pay tax");
     }

     return taxAmount;
 }
}

//CalculatorSimulator Class
public class ExceptionQ1 
{
 public static void main(String[] args) 
 {
     TaxCalculator taxCalculator = new TaxCalculator();
     try 
     {
         String empName = "John";
         boolean isIndian = true;
         double empSal = 120000.0;

         double taxAmount = taxCalculator.calculateTax(empName, isIndian, empSal);
         System.out.println("Tax amount is " + taxAmount);
     } catch (CountryNotValidException e) 
     {
         System.err.println("Country not valid: " + e.getMessage());
         e.printStackTrace();
     } catch (EmployeeNameInvalidException e) 
     {
         System.err.println("Employee name not valid: " + e.getMessage());
         e.printStackTrace();
     } catch (TaxNotEligibleException e) 
     {
         System.err.println("Not eligible for Tax calculation: " + e.getMessage());
         e.printStackTrace();
     }
 }
}

