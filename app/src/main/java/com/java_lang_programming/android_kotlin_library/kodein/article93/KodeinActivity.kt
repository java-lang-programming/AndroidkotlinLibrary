package com.java_lang_programming.android_kotlin_library.kodein.article93

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.factory
import com.java_lang_programming.android_kotlin_library.R
import kotlinx.android.synthetic.main.activity_kodein.*

class KodeinActivity : AppCompatActivity() {

    private val helloFactory = Kodein {
        bind<String>() with factory { type: Int -> Sample.calling(type) }
    }

//    private val helloProvider = Kodein {
//        bind<Int>() with provider { Sample.getBalance() }
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kodein)

        btn_factory.setOnClickListener(onClickFactoryListener)
        //btn_provider.setOnClickListener(onClickProviderListener)
    }

    private val onClickFactoryListener = View.OnClickListener {
        result.text = helloFactory.factory<Int, String>().invoke(1)
    }

//    private val onClickProviderListener = View.OnClickListener {
//        val resultData = helloProvider.provider<Int>().invoke()
//        result.text = resultData.toString()
//    }
}
