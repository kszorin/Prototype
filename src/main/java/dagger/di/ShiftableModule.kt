package dagger.di

import dagger.Binds
import dagger.Module
import dagger.transmission.ManualGear
import dagger.transmission.Shiftable

@Module
interface ShiftableModule {

    @Binds
    fun bindShiftable(manualGear: ManualGear): Shiftable
}