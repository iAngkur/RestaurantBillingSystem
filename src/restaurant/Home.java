/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.awt.Color;
import java.awt.event.KeyEvent;
import static java.rmi.server.LogStream.log;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author iangk
 */
public class Home extends javax.swing.JFrame {

    JFrame frame;

    // Prices for each items
    double Price_Fries = 80.0;
    double Price_Salad = 30.0;
    double Price_Hamburger = 100.0;
    double Price_OnionRings = 50.0;
    double Price_ChikenSalad = 90.0;
    double Price_FishSandwich = 80.0;
    double Price_CheeseSandwich = 200.0;
    double Price_ChikenSandwich = 300.0;
    double Price_HashBrown = 100.0;
    double Price_ToastedBagel = 50.0;
    double Price_PineappleStick = 50.0;
    double Price_ChocolateMuffin = 60.0;
    double Price_Tea = 30.0;
    double Price_Cola = 20.0;
    double Price_Coffee = 40.0;
    double Price_Orange = 40.0;
    double Price_BottleWater = 15.0;
    double Price_VanillaCone = 45.0;
    double Price_VanillaShake = 80.0;
    double Price_StrawberryShake = 70.0;
    double Price_ChocolateMilkShake = 80.0;

    double cupoonCashBack = 0.0;

    int refs;
    Calendar timer;

    String CustomerName;
    String CustomerPhone;
    String date, time;

    double total, cashBack, tax, subTotal;

    Color myColor = new Color(153, 153, 153);

    HashMap<String, Double> itemBought = new HashMap<String, Double>();

    public Home() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox_Fries = new javax.swing.JCheckBox();
        jCheckBox_Salad = new javax.swing.JCheckBox();
        jCheckBox_Hamburger = new javax.swing.JCheckBox();
        jCheckBox_OnionRings = new javax.swing.JCheckBox();
        jCheckBox_ChikenSalad = new javax.swing.JCheckBox();
        jCheckBox_FishSandwich = new javax.swing.JCheckBox();
        jCheckBox_CheeseSandwich = new javax.swing.JCheckBox();
        jCheckBox_ChikenSandwich = new javax.swing.JCheckBox();
        jCheckBox_HashBrown = new javax.swing.JCheckBox();
        jCheckBox_ToastedBagel = new javax.swing.JCheckBox();
        jCheckBox_PineappleStick = new javax.swing.JCheckBox();
        jCheckBox_Tea = new javax.swing.JCheckBox();
        jCheckBox_Cola = new javax.swing.JCheckBox();
        jCheckBox_Coffee = new javax.swing.JCheckBox();
        jCheckBox_Orange = new javax.swing.JCheckBox();
        jCheckBox_BottleWater = new javax.swing.JCheckBox();
        jCheckBox_VanillaCone = new javax.swing.JCheckBox();
        jCheckBox_VanillaShake = new javax.swing.JCheckBox();
        jCheckBox_StrawberryShake = new javax.swing.JCheckBox();
        jCheckBox_ChocolateMilkShake = new javax.swing.JCheckBox();
        jCheckBox_ChocolateMuffin = new javax.swing.JCheckBox();
        jTextField_Fries = new javax.swing.JTextField();
        jTextField_Salad = new javax.swing.JTextField();
        jTextField_Hamburger = new javax.swing.JTextField();
        jTextField_OnionRings = new javax.swing.JTextField();
        jTextField_ChikenSalad = new javax.swing.JTextField();
        jTextField_Tea = new javax.swing.JTextField();
        jTextField_Cola = new javax.swing.JTextField();
        jTextField_Coffee = new javax.swing.JTextField();
        jTextField_Orange = new javax.swing.JTextField();
        jTextField_BottleWater = new javax.swing.JTextField();
        jTextField_FishSandwich = new javax.swing.JTextField();
        jTextField_CheeseSandwich = new javax.swing.JTextField();
        jTextField_ChikenSandwich = new javax.swing.JTextField();
        jTextField_HashBrown = new javax.swing.JTextField();
        jTextField_ToastedBagel = new javax.swing.JTextField();
        jTextField_PineappleStick = new javax.swing.JTextField();
        jTextField_ChocolateMuffin = new javax.swing.JTextField();
        jTextField_VanillaCone = new javax.swing.JTextField();
        jTextField_VanillaShake = new javax.swing.JTextField();
        jTextField_StrawberryShake = new javax.swing.JTextField();
        jTextField_ChocolateMilkShake = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_CustomerName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_CustomerPhone = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel = new javax.swing.JPanel();
        jTextArea_Receipt = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jComboBox_PaymentMethod = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_CashBack = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Total_Btn = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        Reset_Btn = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        Exit_Btn = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel_CashBack = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel_Tax = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel_SubTotal = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jCheckBox_CashBack = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        jLabel_Total = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Print_Btn = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        Cancel_Btn = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rastaurant Billing System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jCheckBox_Fries.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox_Fries.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_Fries.setText("Fries");
        jCheckBox_Fries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_FriesActionPerformed(evt);
            }
        });

        jCheckBox_Salad.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox_Salad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_Salad.setText("Salad");
        jCheckBox_Salad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_SaladActionPerformed(evt);
            }
        });

        jCheckBox_Hamburger.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox_Hamburger.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_Hamburger.setText("Hamburger");
        jCheckBox_Hamburger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_HamburgerActionPerformed(evt);
            }
        });

        jCheckBox_OnionRings.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox_OnionRings.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_OnionRings.setText("Onion Rings");
        jCheckBox_OnionRings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_OnionRingsActionPerformed(evt);
            }
        });

        jCheckBox_ChikenSalad.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox_ChikenSalad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_ChikenSalad.setText("Chiken Salad");
        jCheckBox_ChikenSalad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_ChikenSaladActionPerformed(evt);
            }
        });

        jCheckBox_FishSandwich.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox_FishSandwich.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_FishSandwich.setText("Fish Sandwich");
        jCheckBox_FishSandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_FishSandwichActionPerformed(evt);
            }
        });

        jCheckBox_CheeseSandwich.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox_CheeseSandwich.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_CheeseSandwich.setText("Cheese Sandwich");
        jCheckBox_CheeseSandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_CheeseSandwichActionPerformed(evt);
            }
        });

        jCheckBox_ChikenSandwich.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox_ChikenSandwich.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_ChikenSandwich.setText("Chiken Sandwich");
        jCheckBox_ChikenSandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_ChikenSandwichActionPerformed(evt);
            }
        });

        jCheckBox_HashBrown.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox_HashBrown.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_HashBrown.setText("Hash Brown");
        jCheckBox_HashBrown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_HashBrownActionPerformed(evt);
            }
        });

        jCheckBox_ToastedBagel.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox_ToastedBagel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_ToastedBagel.setText("Toasted Bagel");
        jCheckBox_ToastedBagel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_ToastedBagelActionPerformed(evt);
            }
        });

        jCheckBox_PineappleStick.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox_PineappleStick.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_PineappleStick.setText("Pineapple Stick");
        jCheckBox_PineappleStick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_PineappleStickActionPerformed(evt);
            }
        });

        jCheckBox_Tea.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox_Tea.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_Tea.setText("Tea");
        jCheckBox_Tea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_TeaActionPerformed(evt);
            }
        });

        jCheckBox_Cola.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox_Cola.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_Cola.setText("Cola");
        jCheckBox_Cola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_ColaActionPerformed(evt);
            }
        });

        jCheckBox_Coffee.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox_Coffee.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_Coffee.setText("Coffee");
        jCheckBox_Coffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_CoffeeActionPerformed(evt);
            }
        });

        jCheckBox_Orange.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox_Orange.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_Orange.setText("Orange");
        jCheckBox_Orange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_OrangeActionPerformed(evt);
            }
        });

        jCheckBox_BottleWater.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox_BottleWater.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_BottleWater.setText("Bottle Water");
        jCheckBox_BottleWater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_BottleWaterActionPerformed(evt);
            }
        });

        jCheckBox_VanillaCone.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox_VanillaCone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_VanillaCone.setText("Vanilla Cone");
        jCheckBox_VanillaCone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_VanillaConeActionPerformed(evt);
            }
        });

        jCheckBox_VanillaShake.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox_VanillaShake.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_VanillaShake.setText("Vanilla Shake");
        jCheckBox_VanillaShake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_VanillaShakeActionPerformed(evt);
            }
        });

        jCheckBox_StrawberryShake.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox_StrawberryShake.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_StrawberryShake.setText("Strawberry Shake");
        jCheckBox_StrawberryShake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_StrawberryShakeActionPerformed(evt);
            }
        });

        jCheckBox_ChocolateMilkShake.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox_ChocolateMilkShake.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_ChocolateMilkShake.setText("Chocolate Milk Shake");
        jCheckBox_ChocolateMilkShake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_ChocolateMilkShakeActionPerformed(evt);
            }
        });

        jCheckBox_ChocolateMuffin.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox_ChocolateMuffin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_ChocolateMuffin.setText("Chocolate Muffin");
        jCheckBox_ChocolateMuffin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_ChocolateMuffinActionPerformed(evt);
            }
        });

        jTextField_Fries.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_Fries.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField_Fries.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Fries.setText("0");
        jTextField_Fries.setEnabled(false);
        jTextField_Fries.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_FriesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_FriesKeyTyped(evt);
            }
        });

        jTextField_Salad.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_Salad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField_Salad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Salad.setText("0");
        jTextField_Salad.setEnabled(false);
        jTextField_Salad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_SaladKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_SaladKeyTyped(evt);
            }
        });

        jTextField_Hamburger.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_Hamburger.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField_Hamburger.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Hamburger.setText("0");
        jTextField_Hamburger.setEnabled(false);
        jTextField_Hamburger.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_HamburgerKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_HamburgerKeyTyped(evt);
            }
        });

        jTextField_OnionRings.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_OnionRings.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField_OnionRings.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_OnionRings.setText("0");
        jTextField_OnionRings.setEnabled(false);
        jTextField_OnionRings.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_OnionRingsKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_OnionRingsKeyTyped(evt);
            }
        });

        jTextField_ChikenSalad.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_ChikenSalad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField_ChikenSalad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_ChikenSalad.setText("0");
        jTextField_ChikenSalad.setEnabled(false);
        jTextField_ChikenSalad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_ChikenSaladKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ChikenSaladKeyTyped(evt);
            }
        });

        jTextField_Tea.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_Tea.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField_Tea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Tea.setText("0");
        jTextField_Tea.setEnabled(false);
        jTextField_Tea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_TeaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_TeaKeyTyped(evt);
            }
        });

        jTextField_Cola.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_Cola.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField_Cola.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Cola.setText("0");
        jTextField_Cola.setEnabled(false);
        jTextField_Cola.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_ColaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ColaKeyTyped(evt);
            }
        });

        jTextField_Coffee.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_Coffee.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField_Coffee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Coffee.setText("0");
        jTextField_Coffee.setEnabled(false);
        jTextField_Coffee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_CoffeeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_CoffeeKeyTyped(evt);
            }
        });

        jTextField_Orange.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_Orange.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField_Orange.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Orange.setText("0");
        jTextField_Orange.setEnabled(false);
        jTextField_Orange.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_OrangeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_OrangeKeyTyped(evt);
            }
        });

        jTextField_BottleWater.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_BottleWater.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField_BottleWater.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_BottleWater.setText("0");
        jTextField_BottleWater.setEnabled(false);
        jTextField_BottleWater.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_BottleWaterKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_BottleWaterKeyTyped(evt);
            }
        });

        jTextField_FishSandwich.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_FishSandwich.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField_FishSandwich.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_FishSandwich.setText("0");
        jTextField_FishSandwich.setEnabled(false);
        jTextField_FishSandwich.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_FishSandwichKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_FishSandwichKeyTyped(evt);
            }
        });

        jTextField_CheeseSandwich.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_CheeseSandwich.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField_CheeseSandwich.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_CheeseSandwich.setText("0");
        jTextField_CheeseSandwich.setEnabled(false);
        jTextField_CheeseSandwich.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_CheeseSandwichKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_FishSandwichKeyTyped(evt);
            }
        });

        jTextField_ChikenSandwich.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_ChikenSandwich.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField_ChikenSandwich.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_ChikenSandwich.setText("0");
        jTextField_ChikenSandwich.setEnabled(false);
        jTextField_ChikenSandwich.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_ChikenSandwichKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ChikenSandwichKeyTyped(evt);
            }
        });

        jTextField_HashBrown.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_HashBrown.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField_HashBrown.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_HashBrown.setText("0");
        jTextField_HashBrown.setEnabled(false);
        jTextField_HashBrown.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_HashBrownKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_HashBrownKeyTyped(evt);
            }
        });

        jTextField_ToastedBagel.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_ToastedBagel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField_ToastedBagel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_ToastedBagel.setText("0");
        jTextField_ToastedBagel.setEnabled(false);
        jTextField_ToastedBagel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_ToastedBagelKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ToastedBagelKeyTyped(evt);
            }
        });

        jTextField_PineappleStick.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_PineappleStick.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField_PineappleStick.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_PineappleStick.setText("0");
        jTextField_PineappleStick.setEnabled(false);
        jTextField_PineappleStick.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_PineappleStickKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PineappleStickKeyTyped(evt);
            }
        });

        jTextField_ChocolateMuffin.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_ChocolateMuffin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField_ChocolateMuffin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_ChocolateMuffin.setText("0");
        jTextField_ChocolateMuffin.setEnabled(false);
        jTextField_ChocolateMuffin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_ChocolateMuffinKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ChocolateMuffinKeyTyped(evt);
            }
        });

        jTextField_VanillaCone.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_VanillaCone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField_VanillaCone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_VanillaCone.setText("0");
        jTextField_VanillaCone.setEnabled(false);
        jTextField_VanillaCone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_VanillaConeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_VanillaConeKeyTyped(evt);
            }
        });

        jTextField_VanillaShake.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_VanillaShake.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField_VanillaShake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_VanillaShake.setText("0");
        jTextField_VanillaShake.setEnabled(false);
        jTextField_VanillaShake.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_VanillaShakeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_VanillaShakeKeyTyped(evt);
            }
        });

        jTextField_StrawberryShake.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_StrawberryShake.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField_StrawberryShake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_StrawberryShake.setText("0");
        jTextField_StrawberryShake.setEnabled(false);
        jTextField_StrawberryShake.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_StrawberryShakeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_StrawberryShakeKeyTyped(evt);
            }
        });

        jTextField_ChocolateMilkShake.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_ChocolateMilkShake.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField_ChocolateMilkShake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_ChocolateMilkShake.setText("0");
        jTextField_ChocolateMilkShake.setEnabled(false);
        jTextField_ChocolateMilkShake.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_ChocolateMilkShakeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ChocolateMilkShakeKeyTyped(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel8.setPreferredSize(new java.awt.Dimension(7, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Fast Meal and Vegetarian");

        jLabel10.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Sandwich");

        jLabel11.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Shakes");

        jLabel12.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Desserts");

        jLabel13.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Drinks");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox_ChikenSalad)
                                    .addComponent(jCheckBox_OnionRings)
                                    .addComponent(jCheckBox_Hamburger)
                                    .addComponent(jCheckBox_Salad)
                                    .addComponent(jCheckBox_Fries)
                                    .addComponent(jCheckBox_FishSandwich)
                                    .addComponent(jCheckBox_CheeseSandwich)
                                    .addComponent(jCheckBox_ChikenSandwich)
                                    .addComponent(jCheckBox_HashBrown)
                                    .addComponent(jCheckBox_ToastedBagel)
                                    .addComponent(jCheckBox_PineappleStick)
                                    .addComponent(jCheckBox_ChocolateMuffin))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_OnionRings, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_ChikenSalad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_ChikenSandwich, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_CheeseSandwich, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_FishSandwich, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Fries, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Salad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Hamburger, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_HashBrown, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_ToastedBagel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_PineappleStick, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_ChocolateMuffin, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(83, 83, 83))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(78, 78, 78)))))
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox_Coffee)
                            .addComponent(jCheckBox_Cola)
                            .addComponent(jCheckBox_Tea)
                            .addComponent(jCheckBox_Orange)
                            .addComponent(jCheckBox_BottleWater))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_BottleWater, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Orange, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Tea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Coffee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Cola, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox_ChocolateMilkShake)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                        .addComponent(jTextField_ChocolateMilkShake, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox_VanillaCone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_VanillaCone, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox_VanillaShake)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_VanillaShake, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox_StrawberryShake)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_StrawberryShake, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_Fries)
                            .addComponent(jTextField_Fries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_Salad)
                            .addComponent(jTextField_Salad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_Hamburger)
                            .addComponent(jTextField_Hamburger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_OnionRings)
                            .addComponent(jTextField_OnionRings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_ChikenSalad)
                            .addComponent(jTextField_ChikenSalad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_Tea)
                            .addComponent(jTextField_Tea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_Cola)
                            .addComponent(jTextField_Cola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_Coffee)
                            .addComponent(jTextField_Coffee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_Orange)
                            .addComponent(jTextField_Orange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_BottleWater)
                            .addComponent(jTextField_BottleWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_VanillaCone)
                            .addComponent(jTextField_VanillaCone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_VanillaShake)
                            .addComponent(jTextField_VanillaShake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_StrawberryShake)
                            .addComponent(jTextField_StrawberryShake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_ChocolateMilkShake)
                            .addComponent(jTextField_ChocolateMilkShake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox_FishSandwich)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox_CheeseSandwich)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBox_ChikenSandwich)
                                    .addComponent(jTextField_ChikenSandwich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_FishSandwich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_CheeseSandwich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_HashBrown)
                            .addComponent(jTextField_HashBrown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_ToastedBagel)
                            .addComponent(jTextField_ToastedBagel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_PineappleStick)
                            .addComponent(jTextField_PineappleStick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_ChocolateMuffin)
                            .addComponent(jTextField_ChocolateMuffin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel2.setText("Customer Name:");

        jLabel4.setText("Customer Phone:");

        jTextField_CustomerPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_CustomerPhoneKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Customer Info");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_CustomerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_CustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_CustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_CustomerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTextArea_Receipt.setEditable(false);
        jTextArea_Receipt.setBackground(new java.awt.Color(153, 153, 153));
        jTextArea_Receipt.setColumns(20);
        jTextArea_Receipt.setRows(5);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jTextArea_Receipt, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jTextArea_Receipt, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jComboBox_PaymentMethod.setBackground(new java.awt.Color(153, 153, 153));
        jComboBox_PaymentMethod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox_PaymentMethod.setMaximumRowCount(4);
        jComboBox_PaymentMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Card", "bKash", "Rocket" }));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Tax (15%)");

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Total");

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Sub Total");

        jTextField_CashBack.setBackground(new java.awt.Color(153, 153, 153));
        jTextField_CashBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField_CashBack.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_CashBack.setText("0");
        jTextField_CashBack.setEnabled(false);
        jTextField_CashBack.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_CashBackKeyTyped(evt);
            }
        });

        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Payment Method");

        Total_Btn.setBackground(new java.awt.Color(0, 153, 51));
        Total_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Total_BtnMousePressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Total");

        javax.swing.GroupLayout Total_BtnLayout = new javax.swing.GroupLayout(Total_Btn);
        Total_Btn.setLayout(Total_BtnLayout);
        Total_BtnLayout.setHorizontalGroup(
            Total_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Total_BtnLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        Total_BtnLayout.setVerticalGroup(
            Total_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Total_BtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addContainerGap())
        );

        Reset_Btn.setBackground(new java.awt.Color(255, 153, 0));
        Reset_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Reset_BtnMousePressed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Reset");

        javax.swing.GroupLayout Reset_BtnLayout = new javax.swing.GroupLayout(Reset_Btn);
        Reset_Btn.setLayout(Reset_BtnLayout);
        Reset_BtnLayout.setHorizontalGroup(
            Reset_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Reset_BtnLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        Reset_BtnLayout.setVerticalGroup(
            Reset_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Reset_BtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap())
        );

        Exit_Btn.setBackground(new java.awt.Color(255, 0, 51));
        Exit_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Exit_BtnMousePressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Exit");

        javax.swing.GroupLayout Exit_BtnLayout = new javax.swing.GroupLayout(Exit_Btn);
        Exit_Btn.setLayout(Exit_BtnLayout);
        Exit_BtnLayout.setHorizontalGroup(
            Exit_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Exit_BtnLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel17)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        Exit_BtnLayout.setVerticalGroup(
            Exit_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Exit_BtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_CashBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_CashBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_CashBack.setText("0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_CashBack, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_CashBack, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_Tax.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Tax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Tax.setText("0");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_Tax, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Tax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setPreferredSize(new java.awt.Dimension(78, 31));

        jLabel_SubTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_SubTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_SubTotal.setText("0");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_SubTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel_SubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Cash Back");

        jCheckBox_CashBack.setIconTextGap(1);
        jCheckBox_CashBack.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jCheckBox_CashBack.setMaximumSize(new java.awt.Dimension(17, 13));
        jCheckBox_CashBack.setMinimumSize(new java.awt.Dimension(17, 13));
        jCheckBox_CashBack.setPreferredSize(new java.awt.Dimension(17, 13));
        jCheckBox_CashBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_CashBackActionPerformed(evt);
            }
        });

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_Total.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Total.setText("0");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Total, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Cash Back");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jCheckBox_CashBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Total_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField_CashBack, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox_PaymentMethod, javax.swing.GroupLayout.Alignment.LEADING, 0, 106, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Reset_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Exit_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel6)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel5)
                                .addGap(29, 29, 29)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jCheckBox_CashBack, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel20))
                                        .addGap(8, 8, 8)
                                        .addComponent(jTextField_CashBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel7))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox_PaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Total_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        Print_Btn.setBackground(new java.awt.Color(0, 153, 51));
        Print_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Print_BtnMousePressed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Print");

        javax.swing.GroupLayout Print_BtnLayout = new javax.swing.GroupLayout(Print_Btn);
        Print_Btn.setLayout(Print_BtnLayout);
        Print_BtnLayout.setHorizontalGroup(
            Print_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Print_BtnLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel18)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        Print_BtnLayout.setVerticalGroup(
            Print_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Print_BtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Cancel_Btn.setBackground(new java.awt.Color(255, 0, 51));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Cancel");

        javax.swing.GroupLayout Cancel_BtnLayout = new javax.swing.GroupLayout(Cancel_Btn);
        Cancel_Btn.setLayout(Cancel_BtnLayout);
        Cancel_BtnLayout.setHorizontalGroup(
            Cancel_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cancel_BtnLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel19)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        Cancel_BtnLayout.setVerticalGroup(
            Cancel_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cancel_BtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(Print_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(Cancel_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cancel_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Print_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox_CoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_CoffeeActionPerformed
        // TODO add your handling code here:
        enableTextBox(jCheckBox_Coffee, jTextField_Coffee, "Coffee");
    }//GEN-LAST:event_jCheckBox_CoffeeActionPerformed

    private void jCheckBox_HashBrownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_HashBrownActionPerformed
        // TODO add your handling code here:
        enableTextBox(jCheckBox_HashBrown, jTextField_HashBrown, "HashBrown");
    }//GEN-LAST:event_jCheckBox_HashBrownActionPerformed

    private void jCheckBox_ChikenSaladActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ChikenSaladActionPerformed
        // TODO add your handling code here:
        enableTextBox(jCheckBox_ChikenSalad, jTextField_ChikenSalad, "ChikenSalad");
    }//GEN-LAST:event_jCheckBox_ChikenSaladActionPerformed

    private void Print_BtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Print_BtnMousePressed
        // TODO add your handling code here:

        if (jTextField_CustomerName.getText().equals("") || jTextField_CustomerPhone.getText().equals("")) {
            frame = new JFrame("Warning");
            JOptionPane.showMessageDialog(frame,
                    "Enter Custormer Name and Phone",
                    "WARNING",
                    JOptionPane.WARNING_MESSAGE);

        } else {

            try {
                conn dbCon = new conn();

                String customerName = jTextField_CustomerName.getText();
                String customerPhone = jTextField_CustomerPhone.getText();
                String timeDate = time + " " + date;

                //String query = "INSERT INTO customers (Ref, Name, Phone, Total, Cashback, Tax, Subtotal, TimeDate) VALUES('refs', 'customerName','customerPhone', 'total', 'cashBack','tax', 'subTotal', 'timeDate')";
                //dbCon.stmt.executeQuery(query);

                JOptionPane.showMessageDialog(frame, "Customer Insert Successfully!");

            } catch (Exception e) {
                e.printStackTrace();
//                System.out.println("error: " + e);
                JOptionPane.showMessageDialog(frame, "Insert Failed!");
            }
        }
    }//GEN-LAST:event_Print_BtnMousePressed

    private void Exit_BtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit_BtnMousePressed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if You Want to Exit", "Restaurant",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_Exit_BtnMousePressed

    private void resetingEverything(javax.swing.JCheckBox checkBox, javax.swing.JTextField textField) {

        checkBox.setSelected(false);

        textField.setEnabled(false);
        textField.setBackground(myColor);
        textField.setText("0");

        itemBought.clear();
    }

    private void Reset_BtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reset_BtnMousePressed
        // TODO add your handling code here:

        resetingEverything(jCheckBox_Fries, jTextField_Fries);
        resetingEverything(jCheckBox_Salad, jTextField_Salad);
        resetingEverything(jCheckBox_Hamburger, jTextField_Hamburger);
        resetingEverything(jCheckBox_OnionRings, jTextField_OnionRings);
        resetingEverything(jCheckBox_ChikenSalad, jTextField_ChikenSalad);
        resetingEverything(jCheckBox_FishSandwich, jTextField_FishSandwich);
        resetingEverything(jCheckBox_CheeseSandwich, jTextField_CheeseSandwich);
        resetingEverything(jCheckBox_ChikenSandwich, jTextField_ChikenSandwich);
        resetingEverything(jCheckBox_HashBrown, jTextField_HashBrown);
        resetingEverything(jCheckBox_ToastedBagel, jTextField_ToastedBagel);
        resetingEverything(jCheckBox_PineappleStick, jTextField_PineappleStick);
        resetingEverything(jCheckBox_ChocolateMuffin, jTextField_ChocolateMuffin);
        resetingEverything(jCheckBox_Tea, jTextField_Tea);
        resetingEverything(jCheckBox_Coffee, jTextField_Coffee);
        resetingEverything(jCheckBox_Cola, jTextField_Cola);
        resetingEverything(jCheckBox_Orange, jTextField_Orange);
        resetingEverything(jCheckBox_BottleWater, jTextField_BottleWater);
        resetingEverything(jCheckBox_VanillaCone, jTextField_VanillaCone);
        resetingEverything(jCheckBox_VanillaShake, jTextField_VanillaShake);
        resetingEverything(jCheckBox_StrawberryShake, jTextField_StrawberryShake);
        resetingEverything(jCheckBox_ChocolateMilkShake, jTextField_ChocolateMilkShake);
        resetingEverything(jCheckBox_CashBack, jTextField_CashBack);

        jTextArea_Receipt.setEnabled(false);
        jTextArea_Receipt.setBackground(myColor);
        jTextArea_Receipt.setText("");

        jTextField_CustomerName.setText(null);
        jTextField_CustomerPhone.setText(null);

        jLabel_CashBack.setText("0");
        jLabel_Tax.setText("0");
        jLabel_SubTotal.setText("0");

        jComboBox_PaymentMethod.setSelectedIndex(0);
    }//GEN-LAST:event_Reset_BtnMousePressed

    private void onlyNumber(java.awt.event.KeyEvent evt) {
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber))
                || (iNumber == KeyEvent.VK_BACK_SPACE)
                || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }

    private void jTextField_FriesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_FriesKeyTyped
        // TODO add your handling code here:
        onlyNumber(evt);
    }//GEN-LAST:event_jTextField_FriesKeyTyped

    private void jTextField_SaladKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SaladKeyTyped
        // TODO add your handling code here:
        onlyNumber(evt);
    }//GEN-LAST:event_jTextField_SaladKeyTyped

    private void jTextField_HamburgerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_HamburgerKeyTyped
        // TODO add your handling code here:
        onlyNumber(evt);
    }//GEN-LAST:event_jTextField_HamburgerKeyTyped

    private void jTextField_OnionRingsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_OnionRingsKeyTyped
        // TODO add your handling code here:
        onlyNumber(evt);
    }//GEN-LAST:event_jTextField_OnionRingsKeyTyped

    private void jTextField_ChikenSaladKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ChikenSaladKeyTyped
        // TODO add your handling code here:
        onlyNumber(evt);
    }//GEN-LAST:event_jTextField_ChikenSaladKeyTyped

    private void jTextField_FishSandwichKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_FishSandwichKeyTyped
        // TODO add your handling code here:
        onlyNumber(evt);
    }//GEN-LAST:event_jTextField_FishSandwichKeyTyped

    private void jTextField_ChikenSandwichKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ChikenSandwichKeyTyped
        // TODO add your handling code here:
        onlyNumber(evt);
    }//GEN-LAST:event_jTextField_ChikenSandwichKeyTyped

    private void jTextField_HashBrownKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_HashBrownKeyTyped
        // TODO add your handling code here:
        onlyNumber(evt);
    }//GEN-LAST:event_jTextField_HashBrownKeyTyped

    private void jTextField_ToastedBagelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ToastedBagelKeyTyped
        // TODO add your handling code here:
        onlyNumber(evt);
    }//GEN-LAST:event_jTextField_ToastedBagelKeyTyped

    private void jTextField_PineappleStickKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PineappleStickKeyTyped
        // TODO add your handling code here:
        onlyNumber(evt);
    }//GEN-LAST:event_jTextField_PineappleStickKeyTyped

    private void jTextField_ChocolateMuffinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ChocolateMuffinKeyTyped
        // TODO add your handling code here:
        onlyNumber(evt);
    }//GEN-LAST:event_jTextField_ChocolateMuffinKeyTyped

    private void jTextField_TeaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TeaKeyTyped
        // TODO add your handling code here:
        onlyNumber(evt);
    }//GEN-LAST:event_jTextField_TeaKeyTyped

    private void jTextField_ColaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ColaKeyTyped
        // TODO add your handling code here:
        onlyNumber(evt);
    }//GEN-LAST:event_jTextField_ColaKeyTyped

    private void jTextField_CoffeeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_CoffeeKeyTyped
        // TODO add your handling code here:
        onlyNumber(evt);
    }//GEN-LAST:event_jTextField_CoffeeKeyTyped

    private void jTextField_OrangeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_OrangeKeyTyped
        // TODO add your handling code here:
        onlyNumber(evt);
    }//GEN-LAST:event_jTextField_OrangeKeyTyped

    private void jTextField_BottleWaterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_BottleWaterKeyTyped
        // TODO add your handling code here:
        onlyNumber(evt);
    }//GEN-LAST:event_jTextField_BottleWaterKeyTyped

    private void jTextField_VanillaConeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_VanillaConeKeyTyped
        // TODO add your handling code here:
        onlyNumber(evt);
    }//GEN-LAST:event_jTextField_VanillaConeKeyTyped

    private void jTextField_VanillaShakeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_VanillaShakeKeyTyped
        // TODO add your handling code here:
        onlyNumber(evt);
    }//GEN-LAST:event_jTextField_VanillaShakeKeyTyped

    private void jTextField_StrawberryShakeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_StrawberryShakeKeyTyped
        // TODO add your handling code here:
        onlyNumber(evt);
    }//GEN-LAST:event_jTextField_StrawberryShakeKeyTyped

    private void jTextField_ChocolateMilkShakeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ChocolateMilkShakeKeyTyped
        // TODO add your handling code here:
        onlyNumber(evt);
    }//GEN-LAST:event_jTextField_ChocolateMilkShakeKeyTyped

    private void jTextField_CustomerPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_CustomerPhoneKeyTyped
        // TODO add your handling code here:
        onlyNumber(evt);
    }//GEN-LAST:event_jTextField_CustomerPhoneKeyTyped

    private void jTextField_CashBackKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_CashBackKeyTyped
        // TODO add your handling code here:
        onlyNumber(evt);
    }//GEN-LAST:event_jTextField_CashBackKeyTyped

    private void enableTextBox(javax.swing.JCheckBox checkBox, javax.swing.JTextField textField, String itemKey) {
        if (checkBox.isSelected()) {
            textField.setEnabled(true);
            textField.setBackground(Color.WHITE);
            textField.requestFocus();
            textField.setText("");
        } else {
            textField.setEnabled(false);
            textField.setBackground(myColor);
            textField.setText("0");
            itemBought.remove(itemKey);
        }
    }

    private void jCheckBox_FriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_FriesActionPerformed
        // TODO add your handling code here:
        enableTextBox(jCheckBox_Fries, jTextField_Fries, "Fries");
    }//GEN-LAST:event_jCheckBox_FriesActionPerformed

    private void jCheckBox_SaladActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_SaladActionPerformed
        // TODO add your handling code here:
        enableTextBox(jCheckBox_Salad, jTextField_Salad, "Salad");
    }//GEN-LAST:event_jCheckBox_SaladActionPerformed

    private void jCheckBox_HamburgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_HamburgerActionPerformed
        // TODO add your handling code here:
        enableTextBox(jCheckBox_Hamburger, jTextField_Hamburger, "Hamburger");
    }//GEN-LAST:event_jCheckBox_HamburgerActionPerformed

    private void jCheckBox_OnionRingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_OnionRingsActionPerformed
        // TODO add your handling code here:
        enableTextBox(jCheckBox_OnionRings, jTextField_OnionRings, "OnionRings");
    }//GEN-LAST:event_jCheckBox_OnionRingsActionPerformed

    private void jCheckBox_FishSandwichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_FishSandwichActionPerformed
        // TODO add your handling code here:
        enableTextBox(jCheckBox_FishSandwich, jTextField_FishSandwich, "FishSandwich");
    }//GEN-LAST:event_jCheckBox_FishSandwichActionPerformed

    private void jCheckBox_CheeseSandwichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_CheeseSandwichActionPerformed
        // TODO add your handling code here:
        enableTextBox(jCheckBox_CheeseSandwich, jTextField_CheeseSandwich, "CheeseSandwich");
    }//GEN-LAST:event_jCheckBox_CheeseSandwichActionPerformed

    private void jCheckBox_ChikenSandwichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ChikenSandwichActionPerformed
        // TODO add your handling code here:
        enableTextBox(jCheckBox_ChikenSandwich, jTextField_ChikenSandwich, "ChikenSandwich");
    }//GEN-LAST:event_jCheckBox_ChikenSandwichActionPerformed

    private void jCheckBox_ToastedBagelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ToastedBagelActionPerformed
        // TODO add your handling code here:
        enableTextBox(jCheckBox_ToastedBagel, jTextField_ToastedBagel, "ToastedBagel");
    }//GEN-LAST:event_jCheckBox_ToastedBagelActionPerformed

    private void jCheckBox_PineappleStickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_PineappleStickActionPerformed
        // TODO add your handling code here:
        enableTextBox(jCheckBox_PineappleStick, jTextField_PineappleStick, "PineappleStick");
    }//GEN-LAST:event_jCheckBox_PineappleStickActionPerformed

    private void jCheckBox_ChocolateMuffinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ChocolateMuffinActionPerformed
        // TODO add your handling code here:
        enableTextBox(jCheckBox_ChocolateMuffin, jTextField_ChocolateMuffin, "ChocolateMuffin");
    }//GEN-LAST:event_jCheckBox_ChocolateMuffinActionPerformed

    private void jCheckBox_TeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_TeaActionPerformed
        // TODO add your handling code here:
        enableTextBox(jCheckBox_Tea, jTextField_Tea, "Tea");
    }//GEN-LAST:event_jCheckBox_TeaActionPerformed

    private void jCheckBox_ColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ColaActionPerformed
        // TODO add your handling code here:
        enableTextBox(jCheckBox_Cola, jTextField_Cola, "Cola");
    }//GEN-LAST:event_jCheckBox_ColaActionPerformed

    private void jCheckBox_OrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_OrangeActionPerformed
        // TODO add your handling code here:
        enableTextBox(jCheckBox_Orange, jTextField_Orange, "Orange");
    }//GEN-LAST:event_jCheckBox_OrangeActionPerformed

    private void jCheckBox_BottleWaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_BottleWaterActionPerformed
        // TODO add your handling code here:
        enableTextBox(jCheckBox_BottleWater, jTextField_BottleWater, "BottleWater");
    }//GEN-LAST:event_jCheckBox_BottleWaterActionPerformed

    private void jCheckBox_VanillaConeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_VanillaConeActionPerformed
        // TODO add your handling code here:
        enableTextBox(jCheckBox_VanillaCone, jTextField_VanillaCone, "VanillaCone");
    }//GEN-LAST:event_jCheckBox_VanillaConeActionPerformed

    private void jCheckBox_VanillaShakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_VanillaShakeActionPerformed
        // TODO add your handling code here:
        enableTextBox(jCheckBox_VanillaShake, jTextField_VanillaShake, "VanillaShake");
    }//GEN-LAST:event_jCheckBox_VanillaShakeActionPerformed

    private void jCheckBox_StrawberryShakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_StrawberryShakeActionPerformed
        // TODO add your handling code here:
        enableTextBox(jCheckBox_StrawberryShake, jTextField_StrawberryShake, "StrwaberryShake");
    }//GEN-LAST:event_jCheckBox_StrawberryShakeActionPerformed

    private void jCheckBox_ChocolateMilkShakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ChocolateMilkShakeActionPerformed
        // TODO add your handling code here:
        enableTextBox(jCheckBox_ChocolateMilkShake, jTextField_ChocolateMilkShake, "ChocolateMilkShake");
    }//GEN-LAST:event_jCheckBox_ChocolateMilkShakeActionPerformed

    private void jCheckBox_CashBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_CashBackActionPerformed
        // TODO add your handling code here:
        Color myColor = new Color(153, 153, 153);

        if (jCheckBox_CashBack.isSelected()) {
            jTextField_CashBack.setEnabled(true);
            jTextField_CashBack.setBackground(Color.WHITE);
            jTextField_CashBack.requestFocus();
            jTextField_CashBack.setText("");
        } else {
            jTextField_CashBack.setEnabled(false);
            jTextField_CashBack.setBackground(myColor);
            jTextField_CashBack.setText("0");
        }
    }//GEN-LAST:event_jCheckBox_CashBackActionPerformed

    private void Receipt(String customerName, String customerPhone, double total, double cashBack, double tax, double subTotal) {
        jTextArea_Receipt.setEnabled(true);
        jTextArea_Receipt.setBackground(Color.WHITE);

        refs = 1325 + (int) (Math.random() * 4238);

        timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
        time = tTime.format(timer.getTime());
        SimpleDateFormat Tdate = new SimpleDateFormat("dd-MM-yyyy");
        date = Tdate.format(timer.getTime());

        jTextArea_Receipt.append("\n\tRestaurant Billing System\n\n"
                + " Reference:  " + refs
                + "\n========================================"
                + "\n========================================"
                + "\n Name:  " + customerName
                + "\n Phone:  " + customerPhone
                + "\n========================================");

//        
//        for(String key : itemBought.keySet()) {
//            jTextArea_Receipt.append("\n " + key + "\t\t          " + itemBought.get(key));
//        }
        jTextArea_Receipt.append("\n========================================"
                + "\n Total:\t\t          " + total
                + "\n Cash Back:\t\t          " + cashBack
                + "\n Tax:\t\t          " + tax
                + "\n\n Sub Total:\t\t          " + subTotal
                + "\n========================================"
                + "\n Date: " + date
                + "\t Time:     " + time
                + "\n\n    Thank You For Comming At Our Restaurant\n");

    }


    private void Total_BtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Total_BtnMousePressed
        // TODO add your handling code here:

        jTextArea_Receipt.setText("");

        CustomerName = jTextField_CustomerName.getText();
        CustomerPhone = jTextField_CustomerPhone.getText();

//        System.out.println(itemBought.size());
        total = 0.0;
        for (String key : itemBought.keySet()) {
            if (key == "Fries") {
                total += (Price_Fries * itemBought.get(key));
            } else if (key == "Salad") {
                total += (Price_Salad * itemBought.get(key));
            } else if (key == "Hamburger") {
                total += (Price_Hamburger * itemBought.get(key));
            } else if (key == "OnionRings") {
                total += (Price_OnionRings * itemBought.get(key));
            } else if (key == "ChikenSalad") {
                total += (Price_ChikenSalad * itemBought.get(key));
            } else if (key == "FishSandwich") {
                total += (Price_FishSandwich * itemBought.get(key));
            } else if (key == "CheeseSandwich") {
                total += (Price_CheeseSandwich * itemBought.get(key));
            } else if (key == "ChikenSandwich") {
                total += (Price_ChikenSandwich * itemBought.get(key));
            } else if (key == "HashBrown") {
                total += (Price_HashBrown * itemBought.get(key));
            } else if (key == "ToastedBagel") {
                total += (Price_ToastedBagel * itemBought.get(key));
            } else if (key == "PineappleStick") {
                total += (Price_PineappleStick * itemBought.get(key));
            } else if (key == "ChocolateMuffin") {
                total += (Price_ChocolateMuffin * itemBought.get(key));
            } else if (key == "Tea") {
                total += (Price_Tea * itemBought.get(key));
            } else if (key == "Cola") {
                total += (Price_Cola * itemBought.get(key));
            } else if (key == "Coffee") {
                total += (Price_Coffee * itemBought.get(key));
            } else if (key == "Orange") {
                total += (Price_Orange * itemBought.get(key));
            } else if (key == "BottleWater") {
                total += (Price_BottleWater * itemBought.get(key));
            } else if (key == "VanillaCone") {
                total += (Price_VanillaCone * itemBought.get(key));
            } else if (key == "VanillaShake") {
                total += (Price_VanillaShake * itemBought.get(key));
            } else if (key == "StrawberryShake") {
                total += (Price_StrawberryShake * itemBought.get(key));
            } else if (key == "ChocolateMilkShake") {
                total += (Price_ChocolateMilkShake * itemBought.get(key));
            }
        }
        if (jCheckBox_CashBack.isSelected()) {
            double temp = Double.parseDouble(jTextField_CashBack.getText());
            if (temp >= 0) {
                cupoonCashBack = temp / 100.00;
            }
        }
        cashBack = total * cupoonCashBack;

        double tempTotal = total - cashBack;

        tax = tempTotal * 0.15;

        subTotal = total + tax;

        jLabel_Total.setText(String.valueOf(total));
        jLabel_CashBack.setText(String.valueOf(cashBack));
        jLabel_Tax.setText(String.valueOf(tax));
        jLabel_SubTotal.setText(String.valueOf(subTotal));

        Receipt(CustomerName, CustomerPhone, total, cashBack, tax, subTotal);

    }//GEN-LAST:event_Total_BtnMousePressed

    private void getTotalItemBought(javax.swing.JTextField textField, String foodName) {
//        System.out.println(foodName);
        double temp = Double.parseDouble(textField.getText());
        itemBought.put(foodName, temp);
    }

    private void jTextField_FriesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_FriesKeyReleased
        // TODO add your handling code here:
        getTotalItemBought(jTextField_Fries, "Fries");
    }//GEN-LAST:event_jTextField_FriesKeyReleased

    private void jTextField_SaladKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SaladKeyReleased
        // TODO add your handling code here:
        getTotalItemBought(jTextField_Salad, "Salad");
    }//GEN-LAST:event_jTextField_SaladKeyReleased

    private void jTextField_HamburgerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_HamburgerKeyReleased
        // TODO add your handling code here:
        getTotalItemBought(jTextField_Hamburger, "Hamburger");
    }//GEN-LAST:event_jTextField_HamburgerKeyReleased

    private void jTextField_OnionRingsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_OnionRingsKeyReleased
        // TODO add your handling code here:
        getTotalItemBought(jTextField_OnionRings, "OnionRings");
    }//GEN-LAST:event_jTextField_OnionRingsKeyReleased

    private void jTextField_ChikenSaladKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ChikenSaladKeyReleased
        // TODO add your handling code here:
        getTotalItemBought(jTextField_ChikenSalad, "ChikenSalad");
    }//GEN-LAST:event_jTextField_ChikenSaladKeyReleased

    private void jTextField_FishSandwichKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_FishSandwichKeyReleased
        // TODO add your handling code here:
        getTotalItemBought(jTextField_FishSandwich, "FishSandwich");
    }//GEN-LAST:event_jTextField_FishSandwichKeyReleased

    private void jTextField_CheeseSandwichKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_CheeseSandwichKeyReleased
        // TODO add your handling code here:
        getTotalItemBought(jTextField_CheeseSandwich, "CheeseSandwich");
    }//GEN-LAST:event_jTextField_CheeseSandwichKeyReleased

    private void jTextField_ChikenSandwichKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ChikenSandwichKeyReleased
        // TODO add your handling code here:
        getTotalItemBought(jTextField_ChikenSandwich, "ChikenSandwich");
    }//GEN-LAST:event_jTextField_ChikenSandwichKeyReleased

    private void jTextField_HashBrownKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_HashBrownKeyReleased
        // TODO add your handling code here:
        getTotalItemBought(jTextField_HashBrown, "HashBrown");
    }//GEN-LAST:event_jTextField_HashBrownKeyReleased

    private void jTextField_ToastedBagelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ToastedBagelKeyReleased
        // TODO add your handling code here:
        getTotalItemBought(jTextField_ToastedBagel, "ToastedBagel");
    }//GEN-LAST:event_jTextField_ToastedBagelKeyReleased

    private void jTextField_PineappleStickKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PineappleStickKeyReleased
        // TODO add your handling code here:
        getTotalItemBought(jTextField_PineappleStick, "PineappleStick");
    }//GEN-LAST:event_jTextField_PineappleStickKeyReleased

    private void jTextField_ChocolateMuffinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ChocolateMuffinKeyReleased
        // TODO add your handling code here:
        getTotalItemBought(jTextField_ChocolateMuffin, "ChocolateMuffin");
    }//GEN-LAST:event_jTextField_ChocolateMuffinKeyReleased

    private void jTextField_TeaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TeaKeyReleased
        // TODO add your handling code here:
        getTotalItemBought(jTextField_Tea, "Tea");
    }//GEN-LAST:event_jTextField_TeaKeyReleased

    private void jTextField_ColaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ColaKeyReleased
        // TODO add your handling code here:
        getTotalItemBought(jTextField_Cola, "Cola");
    }//GEN-LAST:event_jTextField_ColaKeyReleased

    private void jTextField_CoffeeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_CoffeeKeyReleased
        // TODO add your handling code here:
        getTotalItemBought(jTextField_Coffee, "Coffee");
    }//GEN-LAST:event_jTextField_CoffeeKeyReleased

    private void jTextField_OrangeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_OrangeKeyReleased
        // TODO add your handling code here:
        getTotalItemBought(jTextField_Orange, "Orange");
    }//GEN-LAST:event_jTextField_OrangeKeyReleased

    private void jTextField_BottleWaterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_BottleWaterKeyReleased
        // TODO add your handling code here:
        getTotalItemBought(jTextField_BottleWater, "BottleWater");
    }//GEN-LAST:event_jTextField_BottleWaterKeyReleased

    private void jTextField_VanillaConeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_VanillaConeKeyReleased
        // TODO add your handling code here:
        getTotalItemBought(jTextField_VanillaCone, "VanillaCone");
    }//GEN-LAST:event_jTextField_VanillaConeKeyReleased

    private void jTextField_VanillaShakeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_VanillaShakeKeyReleased
        // TODO add your handling code here:
        getTotalItemBought(jTextField_VanillaShake, "VanillaShake");
    }//GEN-LAST:event_jTextField_VanillaShakeKeyReleased

    private void jTextField_StrawberryShakeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_StrawberryShakeKeyReleased
        // TODO add your handling code here:
        getTotalItemBought(jTextField_StrawberryShake, "StrawberryShake");
    }//GEN-LAST:event_jTextField_StrawberryShakeKeyReleased

    private void jTextField_ChocolateMilkShakeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ChocolateMilkShakeKeyReleased
        // TODO add your handling code here:
        getTotalItemBought(jTextField_ChocolateMilkShake, "ChocolateMilkShake");
    }//GEN-LAST:event_jTextField_ChocolateMilkShakeKeyReleased

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
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cancel_Btn;
    private javax.swing.JPanel Exit_Btn;
    private javax.swing.JPanel Print_Btn;
    private javax.swing.JPanel Reset_Btn;
    private javax.swing.JPanel Total_Btn;
    private javax.swing.JCheckBox jCheckBox_BottleWater;
    private javax.swing.JCheckBox jCheckBox_CashBack;
    private javax.swing.JCheckBox jCheckBox_CheeseSandwich;
    private javax.swing.JCheckBox jCheckBox_ChikenSalad;
    private javax.swing.JCheckBox jCheckBox_ChikenSandwich;
    private javax.swing.JCheckBox jCheckBox_ChocolateMilkShake;
    private javax.swing.JCheckBox jCheckBox_ChocolateMuffin;
    private javax.swing.JCheckBox jCheckBox_Coffee;
    private javax.swing.JCheckBox jCheckBox_Cola;
    private javax.swing.JCheckBox jCheckBox_FishSandwich;
    private javax.swing.JCheckBox jCheckBox_Fries;
    private javax.swing.JCheckBox jCheckBox_Hamburger;
    private javax.swing.JCheckBox jCheckBox_HashBrown;
    private javax.swing.JCheckBox jCheckBox_OnionRings;
    private javax.swing.JCheckBox jCheckBox_Orange;
    private javax.swing.JCheckBox jCheckBox_PineappleStick;
    private javax.swing.JCheckBox jCheckBox_Salad;
    private javax.swing.JCheckBox jCheckBox_StrawberryShake;
    private javax.swing.JCheckBox jCheckBox_Tea;
    private javax.swing.JCheckBox jCheckBox_ToastedBagel;
    private javax.swing.JCheckBox jCheckBox_VanillaCone;
    private javax.swing.JCheckBox jCheckBox_VanillaShake;
    private javax.swing.JComboBox<String> jComboBox_PaymentMethod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_CashBack;
    private javax.swing.JLabel jLabel_SubTotal;
    private javax.swing.JLabel jLabel_Tax;
    private javax.swing.JLabel jLabel_Total;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextArea jTextArea_Receipt;
    private javax.swing.JTextField jTextField_BottleWater;
    private javax.swing.JTextField jTextField_CashBack;
    private javax.swing.JTextField jTextField_CheeseSandwich;
    private javax.swing.JTextField jTextField_ChikenSalad;
    private javax.swing.JTextField jTextField_ChikenSandwich;
    private javax.swing.JTextField jTextField_ChocolateMilkShake;
    private javax.swing.JTextField jTextField_ChocolateMuffin;
    private javax.swing.JTextField jTextField_Coffee;
    private javax.swing.JTextField jTextField_Cola;
    private javax.swing.JTextField jTextField_CustomerName;
    private javax.swing.JTextField jTextField_CustomerPhone;
    private javax.swing.JTextField jTextField_FishSandwich;
    private javax.swing.JTextField jTextField_Fries;
    private javax.swing.JTextField jTextField_Hamburger;
    private javax.swing.JTextField jTextField_HashBrown;
    private javax.swing.JTextField jTextField_OnionRings;
    private javax.swing.JTextField jTextField_Orange;
    private javax.swing.JTextField jTextField_PineappleStick;
    private javax.swing.JTextField jTextField_Salad;
    private javax.swing.JTextField jTextField_StrawberryShake;
    private javax.swing.JTextField jTextField_Tea;
    private javax.swing.JTextField jTextField_ToastedBagel;
    private javax.swing.JTextField jTextField_VanillaCone;
    private javax.swing.JTextField jTextField_VanillaShake;
    // End of variables declaration//GEN-END:variables
}
