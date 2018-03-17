package com.example.logonrm.configuraopersonagem

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.AdapterView
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_personagem.*

class PersonagemActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personagem)

        sbForca.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                tvForca.setText(progress.toString())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        spEstilo.onItemSelectedListener = (object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?,
                                        view: View?,
                                        position: Int,
                                        id: Long) {

                val tipoPersonagemEnum = TipoPersonagemEnum.from(position)
                when (tipoPersonagemEnum) {
                    TipoPersonagemEnum.FUNKEIRO -> trocarImagem(R.drawable.funkeiro)
                    TipoPersonagemEnum.PUNK -> trocarImagem(R.drawable.punk)
                    TipoPersonagemEnum.GRUNGE -> trocarImagem(R.drawable.grunge)
                    TipoPersonagemEnum.PAGODEIRO -> trocarImagem(R.drawable.pagodeiro)
                    TipoPersonagemEnum.RAPPER -> trocarImagem(R.drawable.rapper)
                }


            }
        })
    }

    fun trocarImagem(idImagem: Int) {
        ivEstilos.setImageDrawable (ContextCompat.getDrawable(
                 this, idImagem
        ))
    }
}
