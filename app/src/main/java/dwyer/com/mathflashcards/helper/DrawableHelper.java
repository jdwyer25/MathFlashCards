package dwyer.com.mathflashcards.helper;

import dwyer.com.mathflashcards.R;

/**
 * Created by jdwyer on 9/5/2016.
 */
public class DrawableHelper {

    public static int getFunctionType(int id) {
        switch(id){
            case R.id.btnMinus:
                return R.drawable.subtract;
            case R.id.btnPlus:
                return R.drawable.add;
            case R.id.btnMultiplication:
                return R.drawable.multiply1;
            case R.id.btnDivide:
                return R.drawable.divide1;
            default:
                return -1;
        }
    }

    public static int getCard(int cardNumber) {
        switch(cardNumber){
            case 0:
                return R.drawable.card_zero;
            case 1:
                return R.drawable.card_one;
            case 2:
                return R.drawable.card_two;
            case 3:
                return R.drawable.card_three;
            case 4:
                return R.drawable.card_four;
            case 5:
                return R.drawable.card_five;
            case 6:
                return R.drawable.card_six;
            case 7:
                return R.drawable.card_seven;
            case 8:
                return R.drawable.card_eight;
            case 9:
                return R.drawable.card_nine;
            case 10:
                return R.drawable.card_ten;
            case 11:
                return R.drawable.card_eleven;
            case 12:
                return R.drawable.card_twelve;
            default:
                return -1;
        }
    }

    public static int getCardValue(int card) {
        switch (card) {
            case R.drawable.card_zero:
                return 0;
            case R.drawable.card_one:
                return 1;
            case R.drawable.card_two:
                return 2;
            case R.drawable.card_three:
                return 3;
            case R.drawable.card_four:
                return 4;
            case R.drawable.card_five:
                return 5;
            case R.drawable.card_six:
                return 6;
            case R.drawable.card_seven:
                return 7;
            case R.drawable.card_eight:
                return 8;
            case R.drawable.card_nine:
                return 9;
            case R.drawable.card_ten:
                return 10;
            case R.drawable.card_eleven:
                return 11;
            case R.drawable.card_twelve:
                return 12;
            default:
                return -1;
        }
    }
}
