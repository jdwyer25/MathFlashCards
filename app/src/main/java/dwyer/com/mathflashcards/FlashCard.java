package dwyer.com.mathflashcards;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FlashCard extends Fragment implements View.OnClickListener {

    protected View v;
    protected Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,
            btnMultiply, btnMultiplyLight, btnDivide, btnDivideLight, btnAdd, btnAddLight,
            btnMinus, btnMinusLight;
    protected TextView txtAnswer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v =  inflater.inflate(R.layout.activity_flash_card, null);

        getViews();

        setOnClickListeners();

        return v;
    }

    private void getViews(){
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
        btnMinus = (Button) v.findViewById(R.id.btnMinus);
        btnMinusLight = (Button) v.findViewById(R.id.btnMinusLight);
        btnAdd = (Button) v.findViewById(R.id.btnPlus);
        btnAddLight = (Button) v.findViewById(R.id.btnPlusLight);
        btnMultiply = (Button) v.findViewById(R.id.btnMultiplication);
        btnMultiplyLight = (Button) v.findViewById(R.id.btnMultiplicationLight);
        btnDivide = (Button) v.findViewById(R.id.btnDivide);
        btnDivideLight = (Button) v.findViewById(R.id.btnDivideLight);

        txtAnswer = (TextView) v.findViewById(R.id.txtAnswer);
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
        btnDivideLight.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnAddLight.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnMinusLight.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiplyLight.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnMinus:
                btnMinus.setVisibility(View.GONE);
                btnMinusLight.setVisibility(View.VISIBLE);
                break;
            case R.id.btnMinusLight:
                btnMinus.setVisibility(View.VISIBLE);
                btnMinusLight.setVisibility(View.GONE);
                break;
            case R.id.btnPlus:
                btnAdd.setVisibility(View.GONE);
                btnAddLight.setVisibility(View.VISIBLE);
                break;
            case R.id.btnPlusLight:
                btnAdd.setVisibility(View.VISIBLE);
                btnAddLight.setVisibility(View.GONE);
                break;
            case R.id.btnMultiplication:
                btnMultiply.setVisibility(View.GONE);
                btnMultiplyLight.setVisibility(View.VISIBLE);
                break;
            case R.id.btnMultiplicationLight:
                btnMultiply.setVisibility(View.VISIBLE);
                btnMultiplyLight.setVisibility(View.GONE);
                break;
            case R.id.btnDivide:
                btnDivide.setVisibility(View.GONE);
                btnDivideLight.setVisibility(View.VISIBLE);
                break;
            case R.id.btnDivideLight:
                btnDivide.setVisibility(View.VISIBLE);
                btnDivideLight.setVisibility(View.GONE);
                break;
        }
    }
}


