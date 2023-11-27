package com.example.meditation

data class state(val title:String, val text_state:String, val image_state: Int)
class MyState
{val state_list = arrayListOf(state("Заголовк статьи", "Краткое описание", R.drawable.state_image_1),
    state("Заголовк статьи", "Краткое описание", R.drawable.state_image_1))
}
