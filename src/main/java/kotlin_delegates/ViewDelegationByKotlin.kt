package kotlin_delegates


import delegate_pattern.PersonViewDelegate
import kotlin_delegates.PersonModule.providePersonDelegateView
import kotlin_delegates.PersonModule.provideSenderView

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

class PersonFragmentDelegate : PersonViewDelegate {

    override fun printPerson(personName: String) {
        println("My name is $personName")
    }
}

interface SenderView {

    fun imSender()

}

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

interface PersonPresenterDelegate {

	fun openFun()
}

class PersonPresenterDelegateImpl(private val view: PersonViewDelegate) : PersonPresenterDelegate {
	override fun openFun() {
		TODO("not implemented")
	}

	fun closeFun() = Unit
}

class SenderPresenter(private val delegate: PersonPresenterDelegate)
	: PersonPresenterDelegate by delegate {

	fun newOpenFun() {
		delegate.openFun()
		delegate.closeFun() // <- ошибка компилятора, unresolved reference
	}
}