/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idealbmi;

import idealbmi.Function.ProgramLogic;
import idealbmi.Model.ModelProgram;
import idealbmi.Model.Operation;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class MainFrame extends javax.swing.JFrame {

	/**
	 * Creates new form MainFrame
	 */
	public MainFrame() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        rb_male = new javax.swing.JRadioButton();
        rb_female = new javax.swing.JRadioButton();
        btn_submit = new javax.swing.JButton();
        label_check = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_height = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_weight = new javax.swing.JTextField();
        btn_count = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_result = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        label_result = new javax.swing.JLabel();
        tf_age = new javax.swing.JTextField();
        btn_tips = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        ta_tips = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Age");

        jLabel3.setText("Gender");

        rb_male.setText("Male");

        rb_female.setText("Female");

        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        label_check.setText("-");

        jLabel5.setText("Height");

        jLabel6.setText("Weight");

        btn_count.setText("Count");
        btn_count.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_countActionPerformed(evt);
            }
        });

        ta_result.setColumns(20);
        ta_result.setRows(5);
        jScrollPane3.setViewportView(ta_result);

        jLabel7.setText("Result");

        label_result.setText("-");

        btn_tips.setText("Look for Tips");
        btn_tips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tipsActionPerformed(evt);
            }
        });

        ta_tips.setColumns(20);
        ta_tips.setRows(5);
        jScrollPane4.setViewportView(ta_tips);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(label_result)
                        .addComponent(tf_age, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_tips)
                        .addComponent(label_check)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rb_male)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rb_female))
                        .addComponent(btn_count)
                        .addComponent(tf_name)
                        .addComponent(tf_weight)
                        .addComponent(tf_height)
                        .addComponent(btn_submit, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4))
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_check)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rb_male)
                    .addComponent(rb_female))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_submit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_result)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_count)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addComponent(btn_tips)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
		// TODO add your handling code here:
		ProgramLogic logic = new ProgramLogic();
		String name = tf_name.getText();

		Boolean check_name = logic.checkName(name);

		String result = "Please input alphabet only";

		if (check_name) {
			result = "Hi " + name + "!";
		}
		label_check.setText(result);
//---------------------------------------------------        
		String age = tf_age.getText();

		Boolean check_age = logic.checkAge(age);

		String output = "Please input your weight in kg and your height in cm";

		if (check_age) {
			label_result.setText(output);
		} else {
			JOptionPane.showMessageDialog(this, "You only can input the age"
					+ " between 1 and 100");
		}
    }//GEN-LAST:event_btn_submitActionPerformed

    private void btn_countActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_countActionPerformed
		// TODO add your handling code here:
		ModelProgram modelProgram = new ModelProgram();
		ProgramLogic logic = new ProgramLogic();
		Operation op = new Operation();

		String a = tf_weight.getText();
		String b = tf_height.getText();

		int inputWeight = Integer.parseInt(a);
		int inputHeight = Integer.parseInt(b);

		modelProgram.setWeight(inputWeight);
		modelProgram.setHeight(inputHeight);
		String output = logic.returnBMI(modelProgram);

		int BMI = Integer.parseInt(output);

		if (BMI >= 30) {
			ta_result.setText("For the information you entered:"
					+ "\nHeight: " + inputHeight + "centimeters"
					+ "\nWeight: " + inputWeight + "kilogram"
					+ "\nYour BMI is " + BMI + ", indicating your weight is in"
					+ " the Obese category.");
		} else if (BMI >= 25) {
			ta_result.setText("For the information you entered:"
					+ "\nHeight: " + inputHeight + "centimeters"
					+ "\nWeight: " + inputWeight + "kilogram"
					+ "\nYour BMI is " + BMI + ", indicating your weight is in"
					+ " the Overweight category.");
		} else if (BMI >= 18.5) {
			ta_result.setText("For the information you entered:"
					+ "\nHeight: " + inputHeight + "centimeters"
					+ "\nWeight: " + inputWeight + "kilogram"
					+ "\nYour BMI is " + BMI + ", indicating your weight is in"
					+ " the Normal category.");
		} else
			ta_result.setText("For the information you entered:"
                    + "\nHeight: " + inputHeight + "centimeters"
                    + "\nWeight: " + inputWeight + "kilogram"
                    + "\nYour BMI is " + BMI + ", indicating your weight is in"
                    + " the Underweight category.");
    }//GEN-LAST:event_btn_countActionPerformed

    private void btn_tipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tipsActionPerformed
		// TODO add your handling code here:
		ModelProgram modelProgram = new ModelProgram();
		ProgramLogic logic = new ProgramLogic();
		Operation op = new Operation();

		String a = tf_weight.getText();
		String b = tf_height.getText();

		int inputWeight = Integer.parseInt(a);
		int inputHeight = Integer.parseInt(b);

		modelProgram.setWeight(inputWeight);
		modelProgram.setHeight(inputHeight);
		String output = logic.returnBMI(modelProgram);

		int BMI = Integer.parseInt(output);
		
		if (BMI >= 30) {
			ta_tips.setText("1. Change your diet. To lose weight, you have to reduce"
                    + "\nthe number of calories you consume."
                    + "\n2. Adding physical activity after reaching a minimum"
                    + "\nof 10% weight-loss goal."
                    + "\n3. Medication. It can help with weight loss for"
                    + " extreme obesity");
		} else if (BMI >= 25) {
			ta_tips.setText("1. Diet. A steady weight loss of about one pound a week is"
                    + "\nthe safest way to lose weight."
                    + "\n2. Regular exercise such as brisk walking, running,"
                    + "\nswimming, biking, and dancing.");
		} else if (BMI >= 18.5) {
			ta_tips.setText("It's important to exercise at least 60-90 minutes most days"
                    + "\nof the week. Staying hydrated and eat a balanced diet"
                    + "\nare equally important.");
		} else
			ta_tips.setText("1. Eat more frequently. When you're underweight, you may feel"
                + "\nfull faster. Eat 5 to 6 smaller meals during the day."
                + "\n2. Choose nutrient-rich foods, such as fruits and vegetables,"
                + "\ndairy products, lean protein sources, and nuts and seeds."
                + "\n3. Try smoothies and shakes, don't drink soda, coffee, and"
                + "\nother drinks with few calories.");
    }//GEN-LAST:event_btn_tipsActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainFrame().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_count;
    private javax.swing.JButton btn_submit;
    private javax.swing.JButton btn_tips;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel label_check;
    private javax.swing.JLabel label_result;
    private javax.swing.JRadioButton rb_female;
    private javax.swing.JRadioButton rb_male;
    private javax.swing.JTextArea ta_result;
    private javax.swing.JTextArea ta_tips;
    private javax.swing.JTextField tf_age;
    private javax.swing.JTextField tf_height;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_weight;
    // End of variables declaration//GEN-END:variables
}
