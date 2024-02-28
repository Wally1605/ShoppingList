import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GUI {
    JFrame frame;
    JPanel panel;
    JPanel panel2;
    JLabel cart;
    JLabel message1;
    JLabel message2;
    JLabel message3;
    JLabel price1;
    JLabel price2;
    JLabel price3;
    JLabel price4;
    JLabel price5;
    JLabel price6;

    JLabel tissues;
    JComboBox tissuesT;
    JLabel water;
    JComboBox waterT;
    JLabel cereal;
    JComboBox cerealT;

    JLabel chicken;
    JComboBox chickenT;

    JLabel beef;
    JComboBox beefT;

    JLabel plates;
    JComboBox platesT;

    JButton submit;
    JLabel total;


    public GUI(){
        frame = new JFrame();
        panel = new JPanel();
        panel2 = new JPanel();
        panel2.setBackground(Color.DARK_GRAY);
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel2.setBorder(BorderFactory.createEmptyBorder(20,0,20,20));

        //frame.setSize(400,350);
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,10,20));
        panel.setLayout(new GridBagLayout());

        String[] quantities = {"0","1","2","3","4","5","6","7","8","9","10"};

        message1 = new JLabel("Shopping Cart");
        message1.setHorizontalAlignment(SwingConstants.LEFT);
        message1.setForeground(Color.lightGray);
        message1.setFont(new Font("Serif", Font.PLAIN, 16));

        message2 = new JLabel("Construct your cart!",SwingConstants.CENTER);

        message3 = new JLabel("*(Bulk discount for more than 3 items.)",SwingConstants.CENTER);
        message3.setForeground(Color.red);



        tissues = new JLabel("12 Pack Tissues");
        price1 = new JLabel("$5",SwingConstants.CENTER);
        tissuesT = new JComboBox(quantities);

        water = new JLabel("6 Pack Water Bottle");
        price2 = new JLabel("$7",SwingConstants.CENTER);
        waterT = new JComboBox(quantities);

        cereal = new JLabel("Store Brand Cereal");
        price3 = new JLabel("$3",SwingConstants.CENTER);
        cerealT = new JComboBox(quantities);

        chicken = new JLabel("16 Oz Chicken Breast");
        price4 = new JLabel("$9",SwingConstants.CENTER);
        chickenT = new JComboBox(quantities);

        beef = new JLabel("16 Oz Beef");
        price5 = new JLabel("$11",SwingConstants.CENTER);
        beefT = new JComboBox(quantities);

        plates = new JLabel("Paper Plates");
        price6 = new JLabel("$6",SwingConstants.CENTER);
        platesT = new JComboBox(quantities);

        submit = new JButton("Add to cart");
        submit.setBackground(Color.ORANGE);
        submit.addActionListener(this::actionPerformed);
        total = new JLabel("Total: ");


        GridBagConstraints gbc = new GridBagConstraints();


        gbc.gridx = 0;
        gbc.gridy = 0;
        panel2.add(message1,gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(message2,gbc);

        gbc.gridx = 3;
        gbc.gridy = 0;
        panel.add(message3,gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(tissues,gbc);
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.ipadx = 2;
        panel.add(price1,gbc);
        gbc.gridx = 3;
        gbc.gridy = 1;
        panel.add(tissuesT,gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(water,gbc);
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.ipadx = 2;
        panel.add(price2,gbc);
        gbc.gridx = 3;
        gbc.gridy = 2;
        panel.add(waterT,gbc);


        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(cereal,gbc);
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.ipadx = 2;
        panel.add(price3,gbc);
        gbc.gridx = 3;
        gbc.gridy = 3;
        panel.add(cerealT,gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(chicken,gbc);
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.ipadx = 2;
        panel.add(price4,gbc);
        gbc.gridx = 3;
        gbc.gridy = 4;
        panel.add(chickenT,gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        panel.add(beef,gbc);
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.ipadx = 2;
        panel.add(price5,gbc);
        gbc.gridx = 3;
        gbc.gridy = 5;
        panel.add(beefT,gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        panel.add(plates,gbc);
        gbc.gridx = 2;
        gbc.gridy = 6;
        gbc.ipadx = 2;
        panel.add(price6,gbc);
        gbc.gridx = 3;
        gbc.gridy = 6;
        panel.add(platesT,gbc);

        gbc.gridx =3;
        gbc.gridy = 7;
        gbc.ipady = 2;
        gbc.insets = new Insets(3,3,3,3);
        panel.add(submit,gbc);

        gbc.gridx =1;
        gbc.gridy = 8;
        panel.add(total,gbc);


        frame.add(panel, BorderLayout.CENTER);
        frame.add(panel2,BorderLayout.NORTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setTitle("Shopping Cart");
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        Item tissue = new Item("12 Pack Tissue",5);
        Item water = new Item("6 Pack Water Bottle",7);
        Item cereal = new Item("Store Brand Cereal",3);
        Item chicken = new Item("16 Oz Chicken Breasts",9);
        Item beef = new Item("16 Oz Beef",11);
        Item plates = new Item("Paper Plates",6);


        int selected = Integer.parseInt(String.valueOf(tissuesT.getSelectedItem()));
        itemOrder t = new itemOrder(tissue,selected);

        selected = Integer.parseInt(String.valueOf(waterT.getSelectedItem()));
        itemOrder w = new itemOrder(water, selected);

        selected = Integer.parseInt(String.valueOf(cerealT.getSelectedItem()));
        itemOrder c = new itemOrder(cereal,selected );

        selected = Integer.parseInt(String.valueOf(chickenT.getSelectedItem()));
        itemOrder ch = new itemOrder(chicken,selected );

        selected = Integer.parseInt(String.valueOf(beefT.getSelectedItem()));
        itemOrder b = new itemOrder(beef, selected);

        selected = Integer.parseInt(String.valueOf(platesT.getSelectedItem()));
        itemOrder p = new itemOrder(plates,selected );

        shoppingCart shop = new shoppingCart();
        shop.addToCart(t);
        shop.addToCart(w);
        shop.addToCart(c);
        shop.addToCart(ch);
        shop.addToCart(b);
        shop.addToCart(p);

        total.setText("Total: $"+shop.cartTotal());

    }
}
