package dwyer.com.mathflashcards;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import dwyer.com.mathflashcards.helper.Config;
import dwyer.com.mathflashcards.helper.DrawableHelper;

public class Fragment_FlashCard extends Fragment implements View.OnClickListener {

    //region Declare widgets and variables
    protected View v;
    protected Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    protected Button btnClear, btnBack, btnSubmit;
    protected TextView txtAnswer, txtRight, txtWrong, txtNumber1, txtNumber2;
    protected ImageView imgType;
    protected StringBuilder sb;
    protected int firstCard = -1, secondCard = -1, funcType;
    protected int right = 0;
    protected int wrong = 0;

    protected String currentEntry;
    //endregion


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtRight.setText(String.valueOf(right));
        txtWrong.setText(String.valueOf(wrong));
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        if(!txtAnswer.getText().equals("")) currentEntry = txtAnswer.getText().toString();
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setRetainInstance(true);
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_flash_card, null);

        Bundle extras = getActivity().getIntent().getExtras();
        if(extras != null) funcType = extras.getInt("functionType");

        //Get the widget ids for the view
        getViews();

        //Set the on click listeners for the button widgets
        setOnClickListeners();

        //Set the math function type
        setFunctionType(funcType);

        //Create a new string builder
        sb = new StringBuilder();

        //check for a current entry
        if(currentEntry != null) {
            //Set the text view
            txtAnswer.setText(currentEntry);

            //set the string builder to the current entry
            sb.append(currentEntry);
        }

        //Get new cards if there are not any selected
        if(firstCard == -1) {
            setImageCards();
        }
        else{
            txtNumber1.setText(String.valueOf(firstCard));
            txtNumber2.setText(String.valueOf(secondCard));
        }

        return v;
    }

    private void setImageCards() {
        //Get the current time in milliseconds
        long time = System.currentTimeMillis();
        //Seed the random number generator with the current time
        Random r = new Random(time);

        //Get a couple of random numbers from 0 to 12
        getRandomCardNumbers(r);

        //For subtraction and division make sure the answer will be positive
        switch(funcType){
            case Config.Divide:
                while(firstCard == 0 || secondCard == 0){
                    getRandomCardNumbers(r);
                }
                firstCard = firstCard * secondCard;
                break;
            case Config.Subtract:
                while(!(firstCard - secondCard >= 0))
                    firstCard = (r.nextInt(12 - 0 + 1) +0);
                break;
        }

        //Set the image resource
        txtNumber1.setText(String.valueOf(firstCard));
        txtNumber2.setText(String.valueOf(secondCard));
    }

    private void getRandomCardNumbers(Random r) {
        firstCard = r.nextInt(12 - 0 + 1) + 0;
        secondCard = r.nextInt(12 - 0 + 1) + 0;
    }

    private void setFunctionType(int id){
        imgType.setImageResource(DrawableHelper.getFunctionType(id));
    }


    private void getViews() {
        btn0 = (Button) v.findViewById(R.id.btn0);
        btn1 = (Button) v.findViewById(R.id.btn1);
        btn2 = (Button) v.findViewById(R.id.btn2);
        btn3 = (Button) v.findViewById(R.id.btn3);
        btn4 = (Button) v.findViewById(R.id.btn4);
        btn5 = (Button) v.findViewById(R.id.btn5);
        btn6 = (Button) v.findViewById(R.id.btn6);
        btn7 = (Button) v.findViewById(R.id.btn7);
        btn8 = (Button) v.findViewById(R.id.btn8);
        btn9 = (Button) v.findViewById(R.id.btn9);

        btnBack = (Button) v.findViewById(R.id.btnBack);
        btnClear = (Button) v.findViewById(R.id.btnClear);
        btnSubmit = (Button) v.findViewById(R.id.btnSubmit);

        txtAnswer = (TextView) v.findViewById(R.id.txtAnswer);
        txtRight = (TextView) v.findViewById(R.id.txtRight);
        txtWrong = (TextView) v.findViewById(R.id.txtWrong);
        txtNumber1 = (TextView) v.findViewById(R.id.txtNumber1);
        txtNumber2 = (TextView) v.findViewById(R.id.txtNumber2);

        imgType = (ImageView) v.findViewById(R.id.imgSymbol);
    }

    private void setOnClickListeners() {
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

        btnBack.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnSubmit.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:
                sb.append(0);
                txtAnswer.setText(sb.toString());
                break;
            case R.id.btn1:
                sb.append(1);
                txtAnswer.setText(sb.toString());
                break;
            case R.id.btn2:
                sb.append(2);
                txtAnswer.setText(sb.toString());
                break;
            case R.id.btn3:
                sb.append(3);
                txtAnswer.setText(sb.toString());
                break;
            case R.id.btn4:
                sb.append(4);
                txtAnswer.setText(sb.toString());
                break;
            case R.id.btn5:
                sb.append(5);
                txtAnswer.setText(sb.toString());
                break;
            case R.id.btn6:
                sb.append(6);
                txtAnswer.setText(sb.toString());
                break;
            case R.id.btn7:
                sb.append(7);
                txtAnswer.setText(sb.toString());
                break;
            case R.id.btn8:
                sb.append(8);
                txtAnswer.setText(sb.toString());
                break;
            case R.id.btn9:
                sb.append(9);
                txtAnswer.setText(sb.toString());
                break;
            case R.id.btnBack:
                if(sb.length() > 0){
                    sb.deleteCharAt(sb.length() - 1);
                    txtAnswer.setText(sb.toString());
                }
                break;
            case R.id.btnClear:
                sb = new StringBuilder();
                currentEntry = sb.toString();
                txtAnswer.setText(sb.toString());
                break;
            case R.id.btnSubmit:
                if(calculateAnswer()){
                    right += 1;
                    txtRight.setText(String.valueOf(right));
                    sb = new StringBuilder();
                    currentEntry = sb.toString();
                    txtAnswer.setText(sb.toString());
                    setImageCards();
                }else {
                    wrong += 1;
                    txtWrong.setText(String.valueOf(wrong));
                    sb =new StringBuilder();
                    currentEntry = sb.toString();
                    txtAnswer.setText(sb.toString());
                    setImageCards();
                }
                break;
        }
    }

    private boolean calculateAnswer() {
        int answer = Integer.parseInt(txtAnswer.getText().toString());
        switch (funcType){
            case Config.Subtract:
                if (answer == firstCard - secondCard) return true;
                break;
            case Config.Add:
                if(answer == firstCard + secondCard) return true;
                break;
            case Config.Divide:
                if (answer == firstCard / secondCard) return true;
                break;
            case Config.Multiply:
                if (answer == firstCard * secondCard) return true;
                break;
        }
        return false;
    }

}


