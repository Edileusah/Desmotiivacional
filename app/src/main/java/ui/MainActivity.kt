package ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.example.motivation.R
import infra.MotivationConstants
import infra.SecurityPreferences
import kotlinx.android.synthetic.main.activity_main.*
import repository.Mock

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mSecurityPreferences: SecurityPreferences
    private var mPhraseFilter: Int = MotivationConstants.PHASEFILTER.ALL

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        mSecurityPreferences = SecurityPreferences(this)
        val name = mSecurityPreferences.getString(MotivationConstants.KEY.PERSON_NAME)
        textName.text = "Olá, $name!\nQue tal uma leve desmotivada?"



       // Logica  inicial de selção DISPARO INICIAL
        imageAll.setColorFilter(ContextCompat.getColor(this, R.color.colorAccent))
        handleNewPhrase()

        buttonNewPhrase.setOnClickListener{
            handleNewPhrase()
        }
        imageAll.setOnClickListener(this)
        imageHappy.setOnClickListener(this)
        imageMorning.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val id = view.id
        val listFilter = listOf(R.id.imageAll, R.id.imageHappy, R.id.imageMorning)

        if (id in listFilter) {
            handleFilter(id)
        }
    }

    private fun handleFilter(id: Int) {

        imageAll.setColorFilter(ContextCompat.getColor(this, R.color.white))
        imageHappy.setColorFilter(ContextCompat.getColor(this, R.color.white))
        imageMorning.setColorFilter(ContextCompat.getColor(this, R.color.white))

        when (id) {
            R.id.imageAll -> {
                imageAll.setColorFilter(ContextCompat.getColor(this, R.color.colorAccent))
                mPhraseFilter = MotivationConstants.PHASEFILTER.ALL
            }
            R.id.imageHappy -> {
                imageHappy.setColorFilter(ContextCompat.getColor(this, R.color.colorAccent))
                mPhraseFilter = MotivationConstants.PHASEFILTER.HAPPY
            }
            R.id.imageMorning -> {
                imageMorning.setColorFilter(ContextCompat.getColor(this, R.color.colorAccent))
                mPhraseFilter = MotivationConstants.PHASEFILTER.MORNING
            }
        }
    }

    private fun handleNewPhrase() {
        texPhrase.text = Mock().getPhrase(mPhraseFilter)
    }
}