package com.example.samojlov_av_homework_module_15_number_1

import java.io.Serializable

data class Picture(val name: String, val author: String, val image: Int) : Serializable {
    companion object {

        val artList = mutableListOf(
            Picture("Богатыри (Три богатыря)", "Васнецов Виктор", R.drawable.bogatyrs),
            Picture("Девочка с персиками", "Серов Валентин", R.drawable.girl_with_peaches),
            Picture("Алёнушка", "Васнецов Виктор", R.drawable.alyonushka),
            Picture("Утро в сосновом лесу", "Шишкин Иван", R.drawable.morning_in_the_pine_forest),
            Picture("Бурлаки на Волге", "Репин Илья", R.drawable.boatmen_on_the_volga),
            Picture(
                "Дети, бегущие от грозы",
                "Маковский Константин",
                R.drawable.children_running_from_a_thunderstorm
            ),
            Picture("Боярыня Морозова", "Суриков Василий", R.drawable.boyarina_morozova),
            Picture("Грачи прилетели", "Саврасов Алексей", R.drawable.rooks_have_arrived),
            Picture("Охотники на привале", "Перов Василий", R.drawable.hunters_at_a_halt),
            Picture(
                "Смотр Черноморского флота в 1849 году",
                "Айвазовский Иван",
                R.drawable.review_of_the_black_sea_fleet_in_1849
            )
        )
    }
}