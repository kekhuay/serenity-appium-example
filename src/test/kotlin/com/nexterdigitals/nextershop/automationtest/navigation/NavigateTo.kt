package com.nexterdigitals.nextershop.automationtest.navigation

import com.nexterdigitals.nextershop.automationtest.common.DailyPopup
import com.nexterdigitals.nextershop.automationtest.common.HeaderTop
import net.serenitybdd.screenplay.Performable
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.actions.Click
import net.serenitybdd.screenplay.actions.Open

object NavigateTo {
    fun theNextershopHomePage(): Performable {
        return Task.where(
            "{0} opens the Nextershop home page",
            Open.browserOn().the(NextershopHomePage::class.java),
            Click.on(DailyPopup.CLOSE)
        )
    }

    fun theNextershopLoginPage(): Performable {
        return Task.where(
            "{0} goes to login page",
            Click.on(HeaderTop.USER_PROFILE_ICON)
        )
    }
}
