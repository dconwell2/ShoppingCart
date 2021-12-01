package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;

public class GUI{
    private JLabel label,label2,userText;
    private JFrame frame,foodFrame;
    private JPanel panel,foodPanel;
    private JButton viewcartButton,browseButton,exitButton,checkOutButton,aButton, aRButton,bButton,bRButton,oButton,oRButton,gButton,gRButton,pButton,pRButton,backButton;
    private ImageIcon image2;

    ShoppingCart cart;

public GUI() {
    ShoppingCart  sCart= new ShoppingCart();
    frame= new JFrame();
    panel = new JPanel();
    frame.setSize(500, 500);                //Size of the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(panel,BorderLayout.CENTER);
    frame.setTitle("Supermarket GUI");
    frame.setVisible(true);
    label = new JLabel("Welcome to the Supermarket");
    label.setBounds(170,25,325,35);

    panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
    panel.add(label);

    panel.setLayout(null);

    viewcartButton = new JButton("View Cart");                        //Creates viewcartButton
    viewcartButton.setBounds(100,210,325,25);           //Sets where the View Cart Button is on the GUI
    //viewcartButton.addActionListener(this::actionPerformed);            //goes to actionPerformed when button is clicked from the user.
    panel.add(viewcartButton);                                            //Adds the button to the panel

    checkOutButton = new JButton("Check Out");                        //Creates CheckOut Button
    checkOutButton.setBounds(100,260,325,25);           //Sets where the Check Out Button is on the GUI
    //viewcartButton.addActionListener(this::actionPerformed);            //goes to actionPerformed when button is clicked from the user.
    panel.add(checkOutButton);                                            //Adds the button to the panel


    browseButton = new JButton("Browse Available Food Products");
    browseButton.setBounds(100,310,325,25);            //Sets where the browseButton Button is on the GUI
    browseButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            foodPanel = new JPanel();
            foodFrame = new JFrame();
            foodFrame.setSize(600, 600);                //Size of the frame
            foodFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            foodFrame.add(foodPanel,BorderLayout.CENTER);
            foodFrame.setTitle("Food Category");
            foodFrame.setVisible(true);
            frame.setVisible(false);
            foodPanel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
            foodPanel.setLayout(null);
            label2= new JLabel("Choose Food Category ");
            label2.setBounds(250,25,325,35);
            foodPanel.add(label2);
            aButton = new JButton("+ Apple $3.00");                        //Creates Add Apple Button
            aButton.setBounds(75,75,150,25);           //Sets where the Add Apple Button is on the GUI
            aButton.addActionListener(new ActionListener() {
                                          @Override
                                          public void actionPerformed(ActionEvent e) {
                                              Item apple = new Item("apple", 2.50);
                                              sCart.AddItem(apple);
                                              userText.setText(sCart.toString());


                                          }
                                      }
            );
            aRButton = new JButton("- Apple -$3.00");                        //Creates Remove Apple Button
            aRButton.setBounds(75,125,150,25);           //Sets where the Remove Apple Button is on the GUI
            aRButton.addActionListener(new ActionListener() {
                                          @Override
                                          public void actionPerformed(ActionEvent e) {
                                              Item apple = new Item("apple", 2.50);
                                              sCart.RemoveItem(apple);
                                              userText.setText(sCart.toString());
                                          }
                                      }
            );
            bButton = new JButton("+ Banana $2.50");                        //Creates Add Banana Button
            bButton.setBounds(240,75,150,25);           //Sets where the Add Banana Button is on the GUI
            bButton.addActionListener(new ActionListener() {
                                          @Override
                                          public void actionPerformed(ActionEvent e) {
                                              userText.setText("Banana Added to Cart");
                                          }
                                      }
            );
            bRButton = new JButton("- Banana -$2.50");                        //Creates Remove Banana Button
            bRButton.setBounds(240,125,150,25);           //Sets where the Remove Banana Button is on the GUI
            bRButton.addActionListener(new ActionListener() {
                                           @Override
                                           public void actionPerformed(ActionEvent e) {
                                               userText.setText("Removed Banana From Cart");
                                           }
                                       }
            );
            oButton = new JButton("+ Orange $2.00");                        //Creates Add Orange Button
            oButton.setBounds(400,75,150,25);           //Sets where the Add Orange Button is on the GUI
            oButton.addActionListener(new ActionListener() {
                                          @Override
                                          public void actionPerformed(ActionEvent e) {
                                              userText.setText("Orange Added to Cart");
                                          }
                                      }
            );
            oRButton = new JButton("- Orange -$2.00");                        //Creates Remove Orange Button
            oRButton.setBounds(400,125,150,25);           //Sets where the Remove Orange Button is on the GUI
            oRButton.addActionListener(new ActionListener() {
                                           @Override
                                           public void actionPerformed(ActionEvent e) {
                                               userText.setText("Removed Orange From Cart");
                                           }
                                       }
            );
            gButton = new JButton("+ Grapes $1.50");                        //Creates Add Grapes Button
            gButton.setBounds(125,200,150,25);           //Sets where the Add Grapes Button is on the GUI
            gButton.addActionListener(new ActionListener() {
                                          @Override
                                          public void actionPerformed(ActionEvent e) {
                                              userText.setText("Grapes Added to Cart");
                                          }
                                      }
            );
            gRButton = new JButton("- Grapes -$1.50");                        //Creates Remove Grapes Button
            gRButton.setBounds(125,250,150,25);           //Sets where the Remove Grapes Button is on the GUI
            gRButton.addActionListener(new ActionListener() {
                                           @Override
                                           public void actionPerformed(ActionEvent e) {
                                               userText.setText("Removed Grapes From Cart");
                                           }
                                       }
            );
            pButton = new JButton("+ Peaches $2.00");                        //Creates Add Peaches Button
            pButton.setBounds(350,200,150,25);           //Sets where the Add Peaches Button is on the GUI
            pButton.addActionListener(new ActionListener() {
                                          @Override
                                          public void actionPerformed(ActionEvent e) {
                                              userText.setText("Peaches Added to Cart");
                                          }
                                      }
            );
            pRButton = new JButton("- Peaches -$2.00");                        //Creates Remove Peaches Button
            pRButton.addActionListener(new ActionListener() {
                                           @Override
                                           public void actionPerformed(ActionEvent e) {
                                               userText.setText("Removed Peaches From Cart");
                                           }
                                       }
            );
            pRButton.setBounds(350,250,150,25);           //Sets where the Remove Peaches Button is on the GUI
            foodPanel.add(aButton);                             //Adds Buttons
            foodPanel.add(bRButton);
            foodPanel.add(aRButton);
            foodPanel.add(bButton);
            foodPanel.add(oButton);
            foodPanel.add(oRButton);
            foodPanel.add(gButton);
            foodPanel.add(gRButton);
            foodPanel.add(pButton);
            foodPanel.add(pRButton);
            userText = new JLabel();                       //Creates label
            userText.setBounds(250, 350, 325, 125);     //Sets where the label is on the GUI
            foodPanel.add(userText);                                        //Adds the label to the panel
            backButton = new JButton("Back to Main Menu");                        //Creates Back Button
            backButton.setBounds(10,525,150,25);           //Sets where the back Button is on the GUI
            backButton.addActionListener(new ActionListener() {
                                           @Override
                                           public void actionPerformed(ActionEvent e) {
                                               frame.setVisible(true);                  //Displays the original Main Menu Frame
                                               foodFrame.setVisible(false);             // hides the food frame
                                           }
                                       }
            );
            foodPanel.add(backButton);


        }
    });            //goes to actionPerformed when button is clicked from the user.
    panel.add(browseButton);                                            //Adds the button to the panel

    exitButton = new JButton("Exit");                           //Creates Exit Button
    exitButton.setBounds(100, 360, 325, 25);      //Sets where the Exit Button is on the GUI
    exitButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);                                   //Exits the application
        }
    }); //goes to actionPerformed when button is clicked from the user.
    panel.add(exitButton);                                          //Adds the button to the panel

    ImageIcon image= new ImageIcon("curbside.jpg");         //Loads curbside image to GUI
    Image image1 = image.getImage();        //transform
    Image newImage = image1.getScaledInstance(120,120,java.awt.Image.SCALE_SMOOTH);  //Scale
    image = new ImageIcon(newImage); //transform back


}

        public static void main(String[] args) {
            new GUI();
        }

}
