package com.example.transactionapp.modules

data class WalletRequest(
    var description:String,
    var reference:String,
    var date:String,
    var amount:String,
    @SerializedName ("transaction_type") var transactionType:String,
)