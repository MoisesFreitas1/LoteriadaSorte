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
public class DuplaSena extends AppCompatActivity {
    private TextView textView2;
    private TextView textView4;
    private TextView textView6;
    private TextView textView8;
    private TextView textView10;
    private TextView textView12;
    private TextView textView14;
    private TextView textView16;
    private TextView textView18;
    private TextView textView20;
    int[] sorteio;
    int nbolas=50;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.duplasena);

        AdView mAdView = (AdView) findViewById(R.id.adView1);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        textView2 = (TextView) findViewById(R.id.textView2);//6
        textView4 = (TextView) findViewById(R.id.textView4);//7
        textView6 = (TextView) findViewById(R.id.textView6);//8
        textView8 = (TextView) findViewById(R.id.textView8);//9
        textView10 = (TextView) findViewById(R.id.textView10);//10
        textView12 = (TextView) findViewById(R.id.textView12);//11
        textView14 = (TextView) findViewById(R.id.textView14);//12
        textView16 = (TextView) findViewById(R.id.textView16);//13
        textView18 = (TextView) findViewById(R.id.textView18);//14
        textView20 = (TextView) findViewById(R.id.textView20);//15

        sorteio = new int[15];
        Button gerar = (Button) findViewById(R.id.button);
        gerar.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        update(6);
                        textView2.setText(sorteio[0] + "  " + sorteio[1] + "  " + sorteio[2] + "  " + sorteio[3] + "  " + sorteio[4] + "  " + sorteio[5]);
                        update(7);
                        textView4.setText(sorteio[0] + "  " + sorteio[1] + "  " + sorteio[2] + "  " + sorteio[3] + "  " + sorteio[4] + "  " + sorteio[5] + "  " + sorteio[6]);
                        update(8);
                        textView6.setText(sorteio[0] + "  " + sorteio[1] + "  " + sorteio[2] + "  " + sorteio[3] + "  " + sorteio[4] + "  " + sorteio[5] + "  " + sorteio[6] + "  " + sorteio[7]);
                        update(9);
                        textView8.setText(sorteio[0] + "  " + sorteio[1] + "  " + sorteio[2] + "  " + sorteio[3] + "  " + sorteio[4] + "  " + sorteio[5] + "  " + sorteio[6] + "  " + sorteio[7] + "  " + sorteio[8]);
                        update(10);
                        textView10.setText(sorteio[0] + "  " + sorteio[1] + "  " + sorteio[2] + "  " + sorteio[3] + "  " + sorteio[4] + "  " + sorteio[5] + "  " + sorteio[6] + "  " + sorteio[7] + "  " + sorteio[8] + "  " + sorteio[9]);
                        update(11);
                        textView12.setText(sorteio[0] + "  " + sorteio[1] + "  " + sorteio[2] + "  " + sorteio[3] + "  " + sorteio[4] + "  " + sorteio[5] + "  " + sorteio[6] + "  " + sorteio[7] + "  " + sorteio[8] + "  " + sorteio[9] + "\n" + sorteio[10]);
                        update(12);
                        textView14.setText(sorteio[0] + "  " + sorteio[1] + "  " + sorteio[2] + "  " + sorteio[3] + "  " + sorteio[4] + "  " + sorteio[5] + "  " + sorteio[6] + "  " + sorteio[7] + "  " + sorteio[8] + "  " + sorteio[9] + "\n" + sorteio[10] + "  " + sorteio[11]);
                        update(13);
                        textView16.setText(sorteio[0] + "  " + sorteio[1] + "  " + sorteio[2] + "  " + sorteio[3] + "  " + sorteio[4] + "  " + sorteio[5] + "  " + sorteio[6] + "  " + sorteio[7] + "  " + sorteio[8] + "  " + sorteio[9] + "\n" + sorteio[10] + "  " + sorteio[11] + "  " + sorteio[12]);
                        update(14);
                        textView18.setText(sorteio[0] + "  " + sorteio[1] + "  " + sorteio[2] + "  " + sorteio[3] + "  " + sorteio[4] + "  " + sorteio[5] + "  " + sorteio[6] + "  " + sorteio[7] + "  " + sorteio[8] + "  " + sorteio[9] + "\n" + sorteio[10] + "  " + sorteio[11] + "  " + sorteio[12] + "  " + sorteio[13]);
                        update(15);
                        textView20.setText(sorteio[0] + "  " + sorteio[1] + "  " + sorteio[2] + "  " + sorteio[3] + "  " + sorteio[4] + "  " + sorteio[5] + "  " + sorteio[6] + "  " + sorteio[7] + "  " + sorteio[8] + "  " + sorteio[9] + "\n" + sorteio[10] + "  " + sorteio[11] + "  " + sorteio[12] + "  " + sorteio[13]+ "  " +sorteio[14]);
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