package dwyer.com.mathflashcards.helper;

import dwyer.com.mathflashcards.R;

/**
 * Created by jdwyer on 9/5/2016.
 */
public class DrawableHelper {

    public static int getFunctionType(int id) {
        switch(id){
            case Config.Subtract:
                return R.drawable.symbol_subtract;
            case Config.Add:
                return R.drawable.symbol_plus;
            case Config.Multiply:
                return R.drawable.symbol_multiply;
            case Config.Divide:
                return R.drawable.symbol_divide;
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
}
