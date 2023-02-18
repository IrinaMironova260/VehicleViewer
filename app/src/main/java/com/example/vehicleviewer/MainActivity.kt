package com.example.vehicleviewer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.vehicleviewer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    private var modeAdapter: ModeAdapter? = null
    private var typeAdapter: TypeAdapter? = null

    private var mode: ArrayList<ModeModel>? = null
    private var airType: ArrayList<TypeModel>? = null
    private var waterType: ArrayList<TypeModel>? = null
    private var groundType: ArrayList<TypeModel>? = null
    private var electricType: ArrayList<TypeModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        init()

        mode?.add(ModeModel(getString(R.string.air), airType!!))
        mode?.add(ModeModel(getString(R.string.water), waterType!!))
        mode?.add(ModeModel(getString(R.string.ground), groundType!!))
        mode?.add(ModeModel(getString(R.string.electric), electricType!!))


        airType?.add(
            TypeModel(
                R.drawable.airplane, getString(R.string.airplane),
                getString(R.string.loadAirplane), getString(R.string.weightAirplane)
            )
        )

        airType?.add(
            TypeModel(
                R.drawable.helicopter, getString(R.string.helicopter),
                getString(R.string.loadHelicopter), getString(R.string.weighHelicopter)
            )
        )


        groundType?.add(
            TypeModel(
                R.drawable.car, getString(R.string.car), getString(R.string.loadCar),
                getString(R.string.weightCar)
            )
        )
        groundType?.add(
            TypeModel(
                R.drawable.byke, getString(R.string.bike), getString(R.string.loadBike),
                getString(R.string.weighBike)
            )
        )
        groundType?.add(
            TypeModel(
                R.drawable.scooter, getString(R.string.scooter), getString(R.string.loadScooter),
                getString(R.string.weightScooter)
            )
        )

        electricType?.add(
            TypeModel(
                R.drawable.elscooter, getString(R.string.electricScooter),
                getString(R.string.loadMotorScooter), getString(R.string.weightMotorScooter)
            )
        )
        electricType?.add(
            TypeModel(
                R.drawable.elcar, getString(R.string.electricCar),
                getString(R.string.loadElectricCar), getString(R.string.weightElectricCar)
            )
        )


        waterType?.add(
            TypeModel(
                R.drawable.boat, getString(R.string.boat), getString(R.string.loadBoat),
                getString(R.string.weighBoat)
            )
        )

        waterType?.add(
            TypeModel(
                R.drawable.waterbike, getString(R.string.waterBike), getString(R.string.loadWaterBike),
                getString(R.string.weighWaterBike)
            )
        )
        waterType?.add(
            TypeModel(
                R.drawable.lyner, getString(R.string.lyner), getString(R.string.loadLyner),
                getString(R.string.weighLyner)
            )
        )

        binding?.modeTransport?.layoutManager = LinearLayoutManager(this)
        modeAdapter = ModeAdapter(this, mode!!)
        binding?.modeTransport?.adapter = modeAdapter

    }

    private fun init() {
        mode = ArrayList<ModeModel>()
        airType = ArrayList<TypeModel>()
        waterType = ArrayList<TypeModel>()
        groundType = ArrayList<TypeModel>()
        electricType = ArrayList<TypeModel>()

    }
}