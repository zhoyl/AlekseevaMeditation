package com.example.meditation

data class feel(val image:Int, val name_feel:String)

class MyFeel{val list = arrayListOf(feel(R.drawable.feelic,"Спокойным"),
    feel(R.drawable.relax_img, "Расслабленным"),
    feel(R.drawable.focus, "Сосредоточенным"),
    feel(R.drawable.anx, "Взволнованным")
)
}
