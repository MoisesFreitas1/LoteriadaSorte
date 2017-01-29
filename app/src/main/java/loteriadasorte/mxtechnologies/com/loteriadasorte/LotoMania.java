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
public class LotoMania extends AppCompatActivity {
    private TextView textView2;
    int[] sorteio;
    int nbolas=100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lotomania);

        AdView mAdView = (AdView) findViewById(R.id.adView3);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        textView2 = (TextView) findViewById(R.id.textView2);//15

        sorteio = new int[50];
        Button gerar = (Button) findViewById(R.id.button);
        gerar.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        update(50);
                        textView2.setText(sorteio[0] + "  " + sorteio[1] + "  " + sorteio[2] + "  " + sorteio[3] + "  " + sorteio[4] + "  " + sorteio[5] + "  " + sorteio[6] + "  " + sorteio[7] + "  " + sorteio[8] + "  " + sorteio[9] + "\n" + sorteio[10] + "  " + sorteio[11] + "  " + sorteio[12] + "  " + sorteio[13] + "  " + sorteio[14] + "  " +sorteio[15] + "  " + sorteio[16] + "  " + sorteio[17] + "  " + sorteio[18] + "  " + sorteio[19] + "\n" + sorteio[20] + "  " + sorteio[21] + "  " + sorteio[22] + "  " + sorteio[23] + "  " + sorteio[24] + "  " + sorteio[25] + "  " + sorteio[26] + "  " + sorteio[27] + "  " + sorteio[28] + "  " + sorteio[29] + "\n" + sorteio[30] + "  " + sorteio[31] + "  " + sorteio[32] + "  " + sorteio[33] + "  " + sorteio[34] + "  " + sorteio[35] + "  " + sorteio[36] + "  " + sorteio[37] + "  " + sorteio[38] + "  " + sorteio[39] + "\n" + sorteio[40] + "  " + sorteio[41] + "  " + sorteio[42] + "  " + sorteio[43] + "  " + sorteio[44]+ "  " + sorteio[45] + "  " + sorteio[46] + "  " + sorteio[47] + "  " + sorteio[48] + "  " + sorteio[49] );
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