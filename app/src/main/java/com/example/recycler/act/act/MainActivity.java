package com.example.recycler.act.act;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.recycler.R;
import com.example.recycler.act.RecyclerItemClickListener;
import com.example.recycler.act.adapter.Adapter;
import com.example.recycler.act.model.WindBlade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {
        private RecyclerView recyclerView;
        private List<WindBlade> listaBlade = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Listagem de Blades
        this.criarBlades();

        //Adapter
        Adapter adapter = new Adapter(listaBlade);

        //Configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

        //Evento Click
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                WindBlade blade = listaBlade.get(position);

                                Toast.makeText(
                                        getApplicationContext(),
                                        "Item pressionado: " + blade.getNumeracao(),
                                        Toast.LENGTH_SHORT
                                ).show();
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Toast.makeText(
                                        getApplicationContext(),
                                        "Click longo",
                                        Toast.LENGTH_LONG
                                ).show();
                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        }
                )
        );
    }

    public void criarBlades(){
        WindBlade blade = new WindBlade("WB X1", "Set YY", "II Turno; dd/MM/yyyy");
        this.listaBlade.add(blade);
        blade = new WindBlade("WB X2", "Set YY", "II Turno; dd/MM/yyyy");
        this.listaBlade.add(blade);
        blade = new WindBlade("WB X3", "Set YY", "II Turno; dd/MM/yyyy");
        this.listaBlade.add(blade);
        blade = new WindBlade("WB X4", "Set YY", "II Turno; dd/MM/yyyy");
        this.listaBlade.add(blade);
        blade = new WindBlade("WB X5", "Set YY", "II Turno; dd/MM/yyyy");
        this.listaBlade.add(blade);
        blade = new WindBlade("WB X6", "Set YY", "II Turno; dd/MM/yyyy");
        this.listaBlade.add(blade);
        blade = new WindBlade("WB X7", "Set YY", "II Turno; dd/MM/yyyy");
        this.listaBlade.add(blade);
        blade = new WindBlade("WB X8", "Set YY", "II Turno; dd/MM/yyyy");
        this.listaBlade.add(blade);
        blade = new WindBlade("WB X9", "Set YY", "II Turno; dd/MM/yyyy");
        this.listaBlade.add(blade);
        blade = new WindBlade("WB X10", "Set YY", "II Turno; dd/MM/yyyy");
        this.listaBlade.add(blade);
        blade = new WindBlade("WB X11", "Set YY", "II Turno; dd/MM/yyyy");
        this.listaBlade.add(blade);

    }
}
