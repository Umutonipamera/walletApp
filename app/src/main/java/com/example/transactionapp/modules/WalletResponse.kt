package com.example.transactionapp.modules

data class WalletResponse(
    var description:String,
    var reference:String,
    var date:String,
    var amount:String,
    @SerializedName ("transaction_type") var transactionType:String,

)
