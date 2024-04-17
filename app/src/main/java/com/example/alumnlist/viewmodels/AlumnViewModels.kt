package com.example.alumnlist.viewmodels

import com.example.alumnlist.R
import com.example.alumnlist.models.Alumn

class AlumnViewModels {
    init {}

    fun getAlumnList(): ArrayList<Alumn> {
        var alumnList: ArrayList<Alumn> = ArrayList<Alumn>()

        //Create list
        alumnList.add(Alumn(19475, "Edson De Jesus Maya Mendez", "edson.maya@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales", true, 9.0, 100, R.drawable.student_icon))
        alumnList.add(Alumn(19508, "Aylin Alvarez Hernandez", "aylin.alvarez@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales", true, 9.0, 100, R.drawable.student_icon))
        alumnList.add(Alumn(19523, "Yoselin Alejandra Mojica Ahumada ", "yoselin.mojica@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales", false, 9.0, 100, R.drawable.student_icon))
        alumnList.add(Alumn(19666, "Sebastián Rubio Quiroz", "sebastian.rubio@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales", true, 9.0, 100, R.drawable.student_icon))
        alumnList.add(Alumn(21637, "Josue David Arreola Aguilera", "josue.arreola@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales", true, 9.0, 100, R.drawable.student_icon))
        alumnList.add(Alumn(21767, "María Fernanda Villarreal Mar", "maria.villarreal02@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales", true, 9.0, 100, R.drawable.student_icon))
        alumnList.add(Alumn(22098, "Gerardo Torres García", "gerardo.torres@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales", true, 9.0, 100, R.drawable.student_icon))
        alumnList.add(Alumn(22154, "Luis Javier Zapata Perales", "luis.zapata01@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales", true, 9.0, 100, R.drawable.student_icon))
        alumnList.add(Alumn(22180, "Alfonso Madero Benítez", "alfonso.madero@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales", true, 9.0, 100, R.drawable.student_icon))
        alumnList.add(Alumn(22208, "David Alejandro Rivera Luna", "david.rivera@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales", true, 9.0, 100, R.drawable.student_icon))
        alumnList.add(Alumn(22210, "Raymundo Gutiérrez Guerrero", "raymundo.gutierrez@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales", false, 9.0, 100, R.drawable.student_icon))

        return alumnList
    }
}