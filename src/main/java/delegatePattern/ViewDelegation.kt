package delegatePattern

import delegatePattern.PersonViewModule.providePersonViewDelegate
import delegatePattern.PersonViewModule.provideSender
import kotlinDelegates.PersonViewDelegate

fun main(args: Array<String>) {
    OmgFragment(
        provideSender(
            providePersonViewDelegate()
        )
    )
}

object PersonViewModule {

    fun providePersonViewDelegate(): PersonViewDelegate =
        PersonFragmentDelegate()

    fun provideSender(personViewDelegate: PersonViewDelegate): SenderView =
        SenderFragment(personViewDelegate)
}

interface OmgView

class OmgFragment(senderView: SenderView) : OmgView {

    init {
        senderView.imSender()
    }
}

interface PersonViewDelegate {

    fun printPerson(personName: String)
}

class PersonPresenterDelegate(val view: PersonViewDelegate)

class PersonFragmentDelegate : PersonViewDelegate {

    override fun printPerson(personName: String) {
        println("My name is $personName")
    }
}

interface SenderView {

    fun imSender()
}

class SendPresenter(val view: SenderView)

class SenderFragment(val personViewDelegate: PersonViewDelegate) :
    SenderView {

    private companion object {
        const val NAME = "Boris"
    }

    override fun imSender() {
        personViewDelegate.printPerson(NAME)
        println("I'm Sender!")
    }
}