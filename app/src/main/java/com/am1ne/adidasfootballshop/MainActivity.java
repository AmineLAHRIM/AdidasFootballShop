package com.am1ne.adidasfootballshop;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.am1ne.adidasfootballshop.adapter.tshirtAdapter;
import com.am1ne.adidasfootballshop.classes.Tshirt;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.cv_logo1)
    CardView cv_logo1;
    @BindView(R.id.cv_logo2)
    CardView cv_logo2;
    @BindView(R.id.cv_logo3)
    CardView cv_logo3;
    @BindView(R.id.cv_logo4)
    CardView cv_logo4;
    @BindView(R.id.cv_logo5)
    CardView cv_logo5;

    @BindView(R.id.list_tshirt)
    RecyclerView list_tshirt;

    CardView[] cardviews;
    tshirtAdapter tshirtAdapter;
    final int RESET_ELEVATION = 0;
    final int WITH_ELEVATION = 20;
    private Context context;
    private ArrayList<Tshirt> tshirts;
    private Tshirt tshirt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        init();


    }

    private void init() {
        context = MainActivity.this;
        cardviews = new CardView[]{
                cv_logo1,
                cv_logo2,
                cv_logo3,
                cv_logo4,
                cv_logo5
        };
        resetElevation();
        clickedCard(cv_logo3);

        tshirts = new ArrayList<Tshirt>();
        tshirts.add(new Tshirt(140,"HOME 19/20",R.drawable.man1));
        tshirts.add(new Tshirt(90,"AWAY 19/20",R.drawable.man2));
        tshirtAdapter = new tshirtAdapter(context, tshirts);
        LinearLayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        list_tshirt.setLayoutManager(layoutManager);
        list_tshirt.setAdapter(tshirtAdapter);

    }


    private void resetElevation() {

        for (int i = 0; i < cardviews.length; i++) {
            cardviews[i].setCardElevation(RESET_ELEVATION);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                cardviews[i].setTranslationZ(RESET_ELEVATION);
            }
        }
    }

    private void clickedCard(CardView cardView) {
        cardView.setCardElevation(WITH_ELEVATION);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            cardView.setTranslationZ(WITH_ELEVATION);
        }
    }


    @OnClick(R.id.cv_logo1)
    public void cv_logo1() {
        resetElevation();
        clickedCard(cv_logo1);
    }

    @OnClick(R.id.cv_logo2)
    public void cv_logo2() {
        resetElevation();
        clickedCard(cv_logo2);
    }

    @OnClick(R.id.cv_logo3)
    public void cv_logo3() {
        resetElevation();
        clickedCard(cv_logo3);
    }

    @OnClick(R.id.cv_logo4)
    public void cv_logo4() {
        resetElevation();
        clickedCard(cv_logo4);
    }

    @OnClick(R.id.cv_logo5)
    public void cv_logo5() {
        resetElevation();
        clickedCard(cv_logo5);
    }
}
