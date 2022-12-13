package com.example.finalassignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Random;



public class Assignment3Controller {

    @FXML
    private ColorPicker studentColor;

    @FXML
    private TextField givenName;

    @FXML
    private Pane firstPanel;

    @FXML
    private Pane secondPanel;

    @FXML
    private Pane thirdPanel;

    @FXML
    private Pane fourthPanel;

    @FXML
    private Pane fifthPanel;

    @FXML
    private Pane sixthPanel;

    @FXML
    private Pane seventhPanel;

    @FXML
    private Pane eighthPanel;

    @FXML
    private Pane ninthPanel;
    @FXML
    private Text naman1;

    @FXML
    private Text naman2;

    @FXML
    private Text naman3;

    @FXML
    private Text naman4;

    @FXML
    private Text naman5;

    @FXML
    private Text naman6;
    @FXML
    private Label wrongMsgDisplay;

    @FXML
    private Text naman7;

    @FXML
    private Text naman8;

    @FXML
    private Text naman9;


    ArrayList<integer> listArr = new ArrayList<integer>(10);

    int inc=0;



    int funRan(int randomNum){

        while(true){
            Random rand = new Random();
            int max = 9;
            int min = 1;
            int range = max - min + 1;
            int ran = (int) (Math.random() * range) + min;

            if(listArr.contains(ran)){
                continue;
            }else{
                listArr.add(ran);
                return ran;

            }
        }
    }


    @FXML
    void onGenerate(ActionEvent event) throws Exception {
        Random rand = new Random();
        int wrong=0;
        String flame=givenName.getText();
        Color color= studentColor.getValue();
        if(inc==9){
            wrongMsgDisplay.setVisible(true);
            wrongMsgDisplay.setText("ALL SEATS Full!! ");
        }
        int randomNumber= rand.nextInt(1,10);

        int num = funRan(randomNumber);



        if(naman1.getText().compareTo(flame)==0||naman2.getText().compareTo(flame)==0||naman3.getText().equals(flame)
                ||naman4.getText().equals(flame)||naman9.getText().equals(flame)){
            wrong=10;

            listArr.remove(listArr.indexOf(num));
        }

        if(color.toString().equals("0xffffffff"))
            wrong=20;
        if(firstPanel.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)) || secondPanel.getStyle().equals("-fx-background-color: #"+color.toString().substring(2))
        ||thirdPanel.getStyle().equals("-fx-background-color: #"+color.toString().substring(2))
        ||fourthPanel.getStyle().equals("-fx-background-color: #"+color.toString().substring(2))
        ||fifthPanel.getStyle().equals("-fx-background-color: #"+color.toString().substring(2))
        ||sixthPanel.getStyle().equals("-fx-background-color: #"+color.toString().substring(2))
    ||seventhPanel.getStyle().equals("-fx-background-color: #"+color.toString().substring(2))
       ||eighthPanel. getStyle().equals("-fx-background-color: #"+color.toString().substring(2))
        ||ninthPanel.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            wrong=20;

        if(flame.isEmpty()){
            wrong=50;
            wrongMsgDisplay.setText("Name is Empty");
            wrongMsgDisplay.setVisible(true);
            listArr.remove(num);
            listArr.remove(listArr.indexOf(num));
        }
        if(wrong==0){
            inc++;
            if(num==1){
                wrongMsgDisplay.setVisible(false);
                firstPanel.setStyle("-fx-background-color: #" +color.toString().substring(2));
                naman1.setText(flame);
                naman1.setVisible(true);
                naman1.setVisible(true);

                if(inc==9){
                    wrongMsgDisplay.setVisible(true);
                    wrongMsgDisplay.setText("Hurray! Full attendance");

                }

            }
            if(num==2){
                wrongMsgDisplay.setVisible(false);
                secondPanel.setStyle("-fx-background-color: #" +color.toString().substring(2));
                naman2.setText(flame);
                naman2.setVisible(true);
                if(inc==9){
                    wrongMsgDisplay.setVisible(true);
                    wrongMsgDisplay.setText("Hurray!FULL attendance");

                }

            }
          
                

            }
            if(num==4){
                wrongMsgDisplay.setVisible(false);
                fourthPanel.setStyle("-fx-background-color: #" +color.toString().substring(2));
                naman4.setText(flame);
                naman4.setVisible(true);
                if(inc==9){
                    wrongMsgDisplay.setVisible(true);
                    wrongMsgDisplay.setText("Hurray!FULL attendance");

                }

            }
            if(num==5){
             
                if(inc==9){
                    wrongMsgDisplay.setVisible(true);
                    wrongMsgDisplay.setText("Hurray!FULL attendance");

                }

            }
            if(num==6){
                wrongMsgDisplay.setVisible(false);
                sixthPanel.setStyle("-fx-background-color: #" +color.toString().substring(2));
                naman6.setText(flame);
                naman6.setVisible(true);
                if(inc==9){
                    wrongMsgDisplay.setVisible(true);
                    wrongMsgDisplay.setText("Hurray!FULL attendance");

                }

            }
            if(num==7){
                wrongMsgDisplay.setVisible(false);
                seventhPanel.setStyle("-fx-background-color: #" +color.toString().substring(2));
                naman7.setText(flame);
                naman7.setVisible(true);
                if(inc==9){
                    wrongMsgDisplay.setVisible(true);
                    wrongMsgDisplay.setText("Hurray!FULL attendance");

                }

           
        }

        else if(wrong==10) {
            wrongMsgDisplay.setText("STUDENT NAME TAKEN!!");
            wrongMsgDisplay.setStyle("-fx-background-color: rgba(255,0,0)");
            wrongMsgDisplay.setVisible(true);

            listArr.remove((Integer) num);

        }
        else if(wrong==20) {
            wrongMsgDisplay.setText("INVALID COLOR");
            wrongMsgDisplay.setStyle("-fx-background-color: rgba(255,0,0)");
            wrongMsgDisplay.setVisible(true);

            listArr.remove(listArr.indexOf(num));

        }
        else {
            wrongMsgDisplay.setVisible(false);
            wrongMsgDisplay.setText("SEATS ARE FULL!!");
            wrongMsgDisplay.setStyle("-fx-background-color: rgba(255,0,0,.4)");
            wrongMsgDisplay.setVisible(true);
        }
    }
    @FXML
    void initialize(){
        naman1.setVisible(false);
        naman3.setVisible(false);
        naman2.setVisible(false);
        naman4.setVisible(false);
        naman5.setVisible(false);
        naman6.setVisible(false);
        naman7.setVisible(false);
       
        wrongMsgDisplay.setVisible(false);
    }


}
