package dwyer.com.mathflashcards;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import dwyer.com.mathflashcards.helper.Config;

public class Fragment_StartScreen extends Fragment implements View.OnClickListener {

    protected View v;
    Button btnAddition, btnSubtraction, btnMultiplication, btnDivision;
    Intent i;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_start_screen, container, false);

        getViews();

        setOnClickListeners();

        return v;
    }

    private void getViews() {
        btnAddition = (Button) v.findViewById(R.id.btnAddition);
        btnSubtraction = (Button) v.findViewById(R.id.btnSubtraction);
        btnMultiplication = (Button) v.findViewById(R.id.btnMultiplication);
        btnDivision = (Button) v.findViewById(R.id.btnDivision);
    }

    private void setOnClickListeners() {
        btnAddition.setOnClickListener(this);
        btnSubtraction.setOnClickListener(this);
        btnMultiplication.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnAddition:
                i = new Intent(this.getActivity(), FlashCardActivity.class);
                i.putExtra("functionType", Config.Add);
                startActivity(i);
                break;
            case R.id.btnSubtraction:
                i = new Intent(this.getActivity(), FlashCardActivity.class);
                i.putExtra("functionType", Config.Subtract);
                startActivity(i);
                break;
            case R.id.btnMultiplication:
                i = new Intent(this.getActivity(), FlashCardActivity.class);
                i.putExtra("functionType", Config.Multiply);
                startActivity(i);
                break;
            case R.id.btnDivision:
                i = new Intent(this.getActivity(), FlashCardActivity.class);
                i.putExtra("functionType", Config.Divide);
                startActivity(i);
                break;
        }
    }
}
