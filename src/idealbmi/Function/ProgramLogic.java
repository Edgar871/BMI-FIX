/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idealbmi.Function;

import idealbmi.Model.ModelProgram;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import idealbmi.Model.Operation;
import java.text.DecimalFormat;

/**
 *
 * @author Asus
 */
public class ProgramLogic extends ModelProgram{
    ModelProgram mp = new ModelProgram();
    
    public Boolean checkName(String name){
        Pattern pattern = Pattern.compile("^[a-zA-Z\\s-]+$");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
    
    public Boolean checkAge(String age){
        Pattern pattern = Pattern.compile("^[1-9]?[0-9]{1}$|^100$");
        Matcher matcher = pattern.matcher(age);
        return matcher.matches();
    }
    
    public String returnBMI(ModelProgram modelProgram){
        Operation op = new Operation();
        DecimalFormat format = new DecimalFormat("##,##");
        double result = op.operation(modelProgram.getWeight(), modelProgram.getHeight());
        String total = "" + format.format(result);
        return total;
    }
	
    public String returnTips(ModelProgram modelProgram){
        if(modelProgram.getTips()>= 30){
            return "1. Change your diet. To lose weight, you have to reduce"
                    + "\nthe number of calories you consume."
                    + "\n2. Adding physical activity after reaching a minimum"
                    + "\nof 10% weight-loss goal."
                    + "\n3. Medication. It can help with weight loss for"
                    + " extreme obesity";
        }
        else if ((modelProgram.getTips()>= 25.0) && (modelProgram.getTips()<= 29.9)){
            return "1. Diet. A steady weight loss of about one pound a week is"
                    + "\nthe safest way to lose weight."
                    + "\n2. Regular exercise such as brisk walking, running,"
                    + "\nswimming, biking, and dancing.";
        }
        else if ((modelProgram.getTips()>= 18.5) && (modelProgram.getTips()<= 24.9)){
            return "It's important to maintain your BMI by exercising at least"
                    + "\n60-90 minutes most days of the week. Staying hydrated"
                    + "\nand eat a balanced diet are equally important.";
        }
        return "1. Eat more frequently. When you're underweight, you may feel"
                + "\nfull faster. Eat 5 to 6 smaller meals during the day."
                + "\n2. Choose nutrient-rich foods, such as fruits and vegetables,"
                + "\ndairy products, lean protein sources, and nuts and seeds."
                + "\n3. Try smoothies and shakes, don't drink soda, coffee, and"
                + "\nother drinks with few calories.";
    }

}

