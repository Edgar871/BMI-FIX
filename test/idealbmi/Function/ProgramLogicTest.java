/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idealbmi.Function;

import idealbmi.Model.ModelProgram;
import idealbmi.Model.Operation;
import java.text.DecimalFormat;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Edgar Hadhyra J
 */
public class ProgramLogicTest {
    ProgramLogic pl;
    
    public ProgramLogicTest() {
    }
    
    @Before
    public void setUp() {
        System.out.println("* Test Aplikasi: sebelum fungsi setUp()");
        pl = new ProgramLogic();
    }
    
    @After
    public void tearDown() {
        System.out.println("* Test Aplikasi: setelah fungsi tearDown()");
        pl = null;
    }

    /**
     * Test of checkName method, of class ProgramLogic.
     */
    @Test
    public void testCheckName() {
        System.out.println("checkName");
        String name = "edgar";
        ProgramLogic instance = new ProgramLogic();
        Boolean result = instance.checkName(name);
        assertEquals(true, result);
    }

    /**
     * Test of checkAge method, of class ProgramLogic.
     */
    @Test
    public void testCheckAge() {
        System.out.println("checkAge");
        String age = "19";
        ProgramLogic instance = new ProgramLogic();
        Boolean result = instance.checkAge(age);
        assertEquals(true, result);
    }

    /**
     * Test of returnBMI method, of class ProgramLogic.
     */
    @Test
    public void testReturnBMI() {
        System.out.println("returnBMI");
        ModelProgram modelProgram = new ModelProgram();
        modelProgram.setHeight(170);
        modelProgram.setWeight(60);
        ProgramLogic instance = new ProgramLogic();
        String total = "21";
        String result = instance.returnBMI(modelProgram);
        assertEquals(total, result);
    }

    /**
     * Test of returnTips method, of class ProgramLogic.
     */
    @Test
    public void testReturnTipsObese() {
        System.out.println("returnTips");
        ModelProgram modelProgram = new ModelProgram();
        modelProgram.setHeight(140);
        modelProgram.setWeight(60);
        modelProgram.setTips(31);
        ProgramLogic instance = new ProgramLogic();
        String expResult = "1. Change your diet. To lose weight, you have to reduce"
                + "\nthe number of calories you consume."
                + "\n2. Adding physical activity after reaching a minimum"
                + "\nof 10% weight-loss goal."
                + "\n3. Medication. It can help with weight loss for"
                + " extreme obesity";
        String result = instance.returnTips(modelProgram);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testReturnTipsOverWeight() {
        System.out.println("returnTips");
        ModelProgram modelProgram = new ModelProgram();
        modelProgram.setHeight(155);
        modelProgram.setWeight(60);
        modelProgram.setTips(25);
        ProgramLogic instance = new ProgramLogic();
        String expResult = "1. Diet. A steady weight loss of about one pound a week is"
                + "\nthe safest way to lose weight."
                + "\n2. Regular exercise such as brisk walking, running,"
                + "\nswimming, biking, and dancing.";
        String result = instance.returnTips(modelProgram);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testReturnTipsNormal() {
        System.out.println("returnTips");
        ModelProgram modelProgram = new ModelProgram();
        modelProgram.setHeight(170);
        modelProgram.setWeight(60);
        modelProgram.setTips(21);
        ProgramLogic instance = new ProgramLogic();
        String expResult = "It's important to maintain your BMI by exercising at least"
                + "\n60-90 minutes most days of the week. Staying hydrated"
                + "\nand eat a balanced diet are equally important.";
        String result = instance.returnTips(modelProgram);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testReturnTipsUnderWeight() {
        System.out.println("returnTips");
        ModelProgram modelProgram = new ModelProgram();
        modelProgram.setHeight(170);
        modelProgram.setWeight(50);
        modelProgram.setTips(17);
        ProgramLogic instance = new ProgramLogic();
        String expResult = "1. Eat more frequently. When you're underweight, you may feel"
                + "\nfull faster. Eat 5 to 6 smaller meals during the day."
                + "\n2. Choose nutrient-rich foods, such as fruits and vegetables,"
                + "\ndairy products, lean protein sources, and nuts and seeds."
                + "\n3. Try smoothies and shakes, don't drink soda, coffee, and"
                + "\nother drinks with few calories.";
        String result = instance.returnTips(modelProgram);
        assertEquals(expResult, result);
    }
}