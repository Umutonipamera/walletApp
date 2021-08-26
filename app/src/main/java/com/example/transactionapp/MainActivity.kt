package com.example.transactionapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.renderscript.ScriptGroup
import com.example.transactionapp.modules.WalletRequest

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    val walletViewModel:WalletViewModel by viewodels()

    @SuppressLint("WrongviewCast")
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState :Bundle?){
            super.onCreate(savedInstanceState)
            binding=ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

        }
        override fun onResume() {
            super.onResume()
            ScriptGroup.Binding.btnTransaction.setClickListener{
                warretTransaction()
            }
        }
        fun warretTransaction(){
            var description=binding.etdescription.toStringg()
            var reference=binding.etReference.toString()
            var date=binding.etDate.toString()
            var amount=binding.etAmount.toString()
            var descriptionType=binding.etDescType.toString()
            var walletRequest=WalletRequest(
                description = description,
                reference=reference,
                date=date,
                amount=amount,
                transactionTYpe=transactionType


            )
    }
}





                }