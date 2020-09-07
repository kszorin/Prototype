package dagger.di

import dagger.Module
import dagger.Provides
import dagger.engine.Block

@Module
class BlockModule {

    @Provides
    fun provideBlock() = Block(6)
}