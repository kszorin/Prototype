package dagger.di

import dagger.CarLine
import dagger.Component


@Component(
    modules = [
        EngineModule::class,
        ShiftableModule::class
    ]
)
interface CarLineComponent {
    fun inject(carLine: CarLine)
}
