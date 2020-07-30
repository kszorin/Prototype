package kotlinDelegates


import delegatePattern.PersonViewDelegate
import kotlinDelegates.PersonModule.providePersonDelegateView
import kotlinDelegates.PersonModule.provideSenderView

fun main(args: Array<String>) {
    FormFragment(
        provideSenderView(
            providePersonDelegateView()
        )
    )
}

object PersonModule {

    fun providePersonDelegateView(): PersonViewDelegate = PersonFragmentDelegate()

    fun provideSenderView(personViewDelegate: PersonViewDelegate) =
        SenderFragment(personViewDelegate)
}

interface FormView

class FormFragment(senderView: SenderView) : FormView {

    init {
        senderView.imSender()
    }
}

interface PersonViewDelegate {

    fun printPerson(personName: String)

}

class PersonPresenterDelegate(private val view: PersonViewDelegate)

class PersonFragmentDelegate : PersonViewDelegate {

    override fun printPerson(personName: String) {
        println("My name is $personName")
    }
}

interface SenderView {

    fun imSender()

}

class SenderPresenter(private val view: SenderView)

class SenderFragment(private val delegate: PersonViewDelegate) : SenderView,
    PersonViewDelegate by delegate {

    private companion object {
        const val NAME = "Boris"
    }

    override fun imSender() {
        delegate.printPerson(NAME)
        println("I'm sender")
    }
}