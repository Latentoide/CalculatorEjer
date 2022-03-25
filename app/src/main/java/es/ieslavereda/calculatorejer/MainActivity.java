package es.ieslavereda.calculatorejer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button num1, num2, num3, num4, num5, num6, num7, num8, num9, num0, clear, equal, sum, res, mul, div;
    TextView mostrar;
    CheckBox check;
    RadioButton mosMult, mosSum, mosRes, mosDiv;
    String aux, first = "0";
    RadioGroup rg;
    boolean  goSum, goDiv, goRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        num0 = findViewById(R.id.num0);
        clear = findViewById(R.id.Clear);
        equal = findViewById(R.id.equal);
        sum = findViewById(R.id.sum);
        res = findViewById(R.id.res);
        mul = findViewById(R.id.mult);
        div = findViewById(R.id.div);
        mostrar = findViewById(R.id.resul);
        check = findViewById(R.id.mostrar);
        mosMult = findViewById(R.id.mosMult);
        mosSum = findViewById(R.id.mosSuma);
        mosRes = findViewById(R.id.mosRes);
        mosDiv = findViewById(R.id.mosDiv);
        rg = findViewById(R.id.rg);
        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);
        num0.setOnClickListener(this);
        clear.setOnClickListener(this);
        equal.setOnClickListener(this);
        sum.setOnClickListener(this);
        div.setOnClickListener(this);
        res.setOnClickListener(this);
        mul.setOnClickListener(this);
        clear.setOnClickListener(this);
        check.setOnClickListener(this);
        mosMult.setOnClickListener(this);
        mosSum.setOnClickListener(this);
        mosRes.setOnClickListener(this);
        mosDiv.setOnClickListener(this);
        mostrar.setText("0");
    }

    @Override
    public void onClick(View view) {
        if(view instanceof Button){
            Button b = (Button) view;
            if(b.getId() == num1.getId()){
                if(!mostrar.getText().equals("0")){
                    aux += "1";
                }else{
                    aux = "1";
                }
            }
            if(b.getId() == num2.getId()){
                if(!mostrar.getText().equals("0")){
                    aux += "2";
                }else{
                    aux = "2";
                }
            }
            if(b.getId() == num3.getId()){
                if(!mostrar.getText().equals("0")){
                    aux += "3";
                }else{
                    aux = "3";
                }
            }
            if(b.getId() == num4.getId()){
                if(!mostrar.getText().equals("0")){
                    aux += "4";
                }else{
                    aux = "4";
                }
            }
            if(b.getId() == num5.getId()){
                if(!mostrar.getText().equals("0")){
                    aux += "5";
                }else{
                    aux = "5";
                }
            }
            if(b.getId() == num6.getId()){
                if(!mostrar.getText().equals("0")){
                    aux += "6";
                }else{
                    aux = "6";
                }
            }
            if(b.getId() == num7.getId()){
                if(!mostrar.getText().equals("0")){
                    aux += "7";
                }else{
                    aux = "7";
                }
            }
            if(b.getId() == num8.getId()){
                if(!mostrar.getText().equals("0")){
                    aux += "8";
                }else{
                    aux = "8";
                }
            }
            if(b.getId() == num9.getId()){
                if(!mostrar.getText().equals("0")){
                    aux += "9";
                }else{
                    aux = "9";
                }
            }
            if(b.getId() == num0.getId()){
                if(!mostrar.getText().equals("0")){
                    aux += "0";
                }else{
                    aux = "0";
                }
            }
            if(b.getId() == clear.getId()){
                aux = "0";
                first = "0";
            }
            if(b.getId() == equal.getId() && first != null){
                if(goSum){
                    int aux2 = (Integer.parseInt(first) + Integer.parseInt(aux));
                    first = "0";
                    aux = aux2 + "";
                }else if(goRes){
                    int aux2 = (Integer.parseInt(first) - Integer.parseInt(aux));
                    first = "0";
                    aux = aux2 + "";
                }else if(goDiv){
                    int aux2 = (Integer.parseInt(first) / Integer.parseInt(aux));
                    first = "0";
                    aux = aux2 + "";
                }else{
                    int aux2 = (Integer.parseInt(first) * Integer.parseInt(aux));
                    first = "0";
                    aux = aux2 + "";
                }
                goSum = false;
                goRes = false;
                goDiv = false;
            }
            if(b.getId() == sum.getId()){
                first = aux;
                aux = "0";
                goSum = true;
                goRes = false;
                goDiv = false;
            }
            if(b.getId() == res.getId()){
                first = aux;
                aux = "0";
                goSum = false;
                goRes = true;
                goDiv = false;
            }
            if(b.getId() == div.getId()){
                first = aux;
                aux = "0";
                goSum = false;
                goRes = false;
                goDiv = true;
            }
            if(b.getId() == mul.getId()){
                first = aux;
                aux = "0";
                goSum = false;
                goRes = false;
                goDiv = false;
            }
        }
        if(view instanceof CheckBox){
            CheckBox checked = (CheckBox) view;
            if(checked.getId() == check.getId() &&  check.isChecked()){
                rg.setVisibility(View.GONE);
                mosMult.setVisibility(View.GONE);
                mosRes.setVisibility(View.GONE);
                mosDiv.setVisibility(View.GONE);
                mosSum.setVisibility(View.GONE);
            }else{
                rg.setVisibility(View.VISIBLE);
                mosMult.setVisibility(View.VISIBLE);
                mosRes.setVisibility(View.VISIBLE);
                mosDiv.setVisibility(View.VISIBLE);
                mosSum.setVisibility(View.VISIBLE);
            }
        }
        if(view instanceof RadioButton){
            RadioButton rd = (RadioButton) view;
            if(rd.getId() == mosMult.getId()){
                mul.setEnabled(false);
                div.setEnabled(true);
                res.setEnabled(true);
                sum.setEnabled(true);
            }
            if(rd.getId() == mosRes.getId()){
                mul.setEnabled(true);
                div.setEnabled(true);
                res.setEnabled(false);
                sum.setEnabled(true);
            }
            if(rd.getId() == mosDiv.getId()){
                mul.setEnabled(true);
                div.setEnabled(false);
                res.setEnabled(true);
                sum.setEnabled(true);
            }
            if(rd.getId() == mosSum.getId()){
                mul.setEnabled(true);
                div.setEnabled(true);
                res.setEnabled(true);
                sum.setEnabled(false);
            }
        }
        mostrar.setText(aux);
    }
}