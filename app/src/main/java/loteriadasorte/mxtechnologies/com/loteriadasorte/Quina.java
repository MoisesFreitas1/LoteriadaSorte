package loteriadasorte.mxtechnologies.com.loteriadasorte;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Random;

/**
 * Created by Moisés on 07/03/2016.
 */
public class Quina extends AppCompatActivity {
    private TextView textView2;
    private TextView textView4;
    private TextView textView6;
    int[] sorteio;
    int nbolas=80;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quina);

        AdView mAdView = (AdView) findViewById(R.id.adView5);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        textView2 = (TextView) findViewById(R.id.textView2);//5
        textView4 = (TextView) findViewById(R.id.textView4);//6
        textView6 = (TextView) findViewById(R.id.textView6);//7

        sorteio = new int[15];
        Button gerar = (Button) findViewById(R.id.button);
        gerar.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        update(5);
                        textView2.setText(sorteio[0] + "  " + sorteio[1] + "  " + sorteio[2] + "  " + sorteio[3] + "  " + sorteio[4]);
                        update(6);
                        textView4.setText(sorteio[0] + "  " + sorteio[1] + "  " + sorteio[2] + "  " + sorteio[3] + "  " + sorteio[4] + "  " + sorteio[5]);
                        update(7);
                        textView6.setText(sorteio[0] + "  " + sorteio[1] + "  " + sorteio[2] + "  " + sorteio[3] + "  " + sorteio[4] + "  " + sorteio[5] + "  " + sorteio[6]);
                    }
                });
    }
    private void update(int nsorteio) {
        int bolas [];
        int aux;
        Random random  = new Random();
        bolas = new int[nbolas];
        for(int b=0;b<nbolas;b++){
            bolas[b]=b+1;
        }
        for (int n=0;n<nsorteio;n++){
            do{
                aux=random.nextInt(nbolas);
                sorteio[n]=bolas[aux];
            }while(bolas[aux]==0);
            bolas[aux]=0;
        }
        int aux2;
        for (int i=0;i<nsorteio;i++){
            for(int j=0;j<(nsorteio);j++){
                aux2=sorteio[i];
                if(aux2<sorteio[j]){
                    sorteio[i]=sorteio[j];
                    sorteio[j]=aux2;
                }
            }
        }
    }
}