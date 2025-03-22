/*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
*	Homekit CT Corrector
*
*	Author:
*		mrmikeface
*
*	Documentation:  TBD
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
*
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
*/


import com.hubitat.app.DeviceWrapper
import com.hubitat.hub.domain.Event

definition(
        name: "Homekit CT Corrector",
        namespace: "homekitcorrect",
        author: "mrmikeface",
        importURL: "",
        description: "Adjust device color temperature when controlled by homekit via hubitat",
        category: "Lighting",
        iconUrl: "",
        iconX2Url: ""
)

preferences {
  page name: "MainPage", install: true, uninstall: true
  page name: "ColorTemperatureOptions"
}

def MainPage(){
  dynamicPage(name: "MainPage") {

    section("<h2>Hubitat Homekit Corrector</h2>"){
      paragraph "Adjust device color temperature when controlled by homekit via hubitat."
      label title: "Enter a name for this instance of the application (optional)"
    }

    section("<h2>Select Devices</h2>") {
      paragraph "Individual devices should only be selected for one group"
      input "colorTemperatureDevices", "capability.colorTemperature", title: "<b>Color temperature devices (CT mode)</b>", multiple:true
    }

    section("<h2>Advanced Options</h2>") {
      input(name:"waitTime",
              type:"number",
              title: "Amount of time in milliseconds to search for events",
              description: "Interval used to find a corresponding homekit command event for a colour change",
              defaultValue: 200L,
              required: true,
              displayDuringSetup: true
      )
      href(name: "toColorTemperatureOptions",
              title: "<b>Color Temperature Options</b>",
              page: "ColorTemperatureOptions",
              description: "Set Advanced Color Temperature Options"
      )
    }

    section("<h2>Logging</h2>") {
      input(name:"logDescriptionText",
              type:"bool",
              title: "Enable descriptionText logging",
              description: "Logs information regarding application activity (Default: On)",
              defaultValue: true,
              required: true,
              displayDuringSetup: true
      )
      input(name:"logEnhancedDescriptionText",
              type:"bool",
              title: "Enable enhanced descriptionText logging",
              description: "Logs additional information regarding application activity (Default: On)",
              defaultValue: false,
              required: true,
              displayDuringSetup: true
      )
      input(name:"logDebug",
              type:"bool",
              title: "Enable debug logging",
              description: "Logs detailed data regarding application values (Default: Off)",
              defaultValue: false,
              required: true,
              displayDuringSetup: true
      )
    }
  }



}

def ColorTemperatureOptions() {
  dynamicPage(name: "ColorTemperatureOptions") {

    section("<h2>Color Temperature Options</h2>"){
      paragraph "The color temperature range available from homekit.<br><br>"
      input "useCTOverrides", "bool", title: "<b>Use Color Temperature Overrides?</b>"
      input "warmCTOverride", "number", title: "Warm White Temperature (default is 2500)"
      input "coldCTOverride", "number", title: "Cold White Temperature (default is max of an individual light)"
    }

    section("<h2>CT Options</h2>") {
      input "useIndividualCTOverrides", "bool", title: "<b>Use Individual Color Temperature Overrides?</b>"
    }

    section("<b>Override 1</b>") {
      paragraph "The color temperature range available from homekit.<br><br>"
      input "colorTemperatureDevicesOverride1", "capability.colorTemperature", title: "<b>Color temperature devices (CT mode)</b>", multiple:true
      input "warmCTOverride1", "number", title: "Warm White Temperature (default is 2500)"
      input "coldCTOverride1", "number", title: "Cold White Temperature (default is max of an individual light)"
    }

    section("<b>Override 2</b>") {
      paragraph "The color temperature range available from homekit.<br><br>"
      input "colorTemperatureDevicesOverride2", "capability.colorTemperature", title: "<b>Color temperature devices (CT mode)</b>", multiple:true
      input "warmCTOverride2", "number", title: "Warm White Temperature (default is 2500)"
      input "coldCTOverride2", "number", title: "Cold White Temperature (default is max of an individual light)"
    }

    section("<b>Override 3</b>") {
      paragraph "The color temperature range available from homekit.<br><br>"
      input "colorTemperatureDevicesOverride3", "capability.colorTemperature", title: "<b>Color temperature devices (CT mode)</b>", multiple:true
      input "warmCTOverride3", "number", title: "Warm White Temperature (default is 2500)"
      input "coldCTOverride3", "number", title: "Cold White Temperature (default is max of an individual light)"
    }

    section("<b>Override 4</b>") {
      paragraph "The color temperature range available from homekit.<br><br>"
      input "colorTemperatureDevicesOverride4", "capability.colorTemperature", title: "<b>Color temperature devices (CT mode)</b>", multiple:true
      input "warmCTOverride4", "number", title: "Warm White Temperature (default is 2500)"
      input "coldCTOverride4", "number", title: "Cold White Temperature (default is max of an individual light)"
    }

    section("<b>Override 5</b>") {
      paragraph "The color temperature range available from homekit.<br><br>"
      input "colorTemperatureDevicesOverride5", "capability.colorTemperature", title: "<b>Color temperature devices (CT mode)</b>", multiple:true
      input "warmCTOverride5", "number", title: "Warm White Temperature (default is 2500)"
      input "coldCTOverride5", "number", title: "Cold White Temperature (default is max of an individual light)"
    }

    section("<b>Override 6</b>") {
      paragraph "The color temperature range available from homekit.<br><br>"
      input "colorTemperatureDevicesOverride6", "capability.colorTemperature", title: "<b>Color temperature devices (CT mode)</b>", multiple:true
      input "warmCTOverride6", "number", title: "Warm White Temperature (default is 2500)"
      input "coldCTOverride6", "number", title: "Cold White Temperature (default is max of an individual light)"
    }

    section("<b>Override 7</b>") {
      paragraph "The color temperature range available from homekit.<br><br>"
      input "colorTemperatureDevicesOverride7", "capability.colorTemperature", title: "<b>Color temperature devices (CT mode)</b>", multiple:true
      input "warmCTOverride7", "number", title: "Warm White Temperature (default is 2500)"
      input "coldCTOverride7", "number", title: "Cold White Temperature (default is max of an individual light)"
    }

    section("<b>Override 8</b>") {
      paragraph "The color temperature range available from homekit.<br><br>"
      input "colorTemperatureDevicesOverride8", "capability.colorTemperature", title: "<b>Color temperature devices (CT mode)</b>", multiple:true
      input "warmCTOverride8", "number", title: "Warm White Temperature (default is 2500)"
      input "coldCTOverride8", "number", title: "Cold White Temperature (default is max of an individual light)"
    }

    section("<b>Override 9</b>") {
      paragraph "The color temperature range available from homekit.<br><br>"
      input "colorTemperatureDevicesOverride9", "capability.colorTemperature", title: "<b>Color temperature devices (CT mode)</b>", multiple:true
      input "warmCTOverride9", "number", title: "Warm White Temperature (default is 2500)"
      input "coldCTOverride9", "number", title: "Cold White Temperature (default is max of an individual light)"
    }

    section("<b>Override 10</b>") {
      paragraph "The color temperature range available from homekit.<br><br>"
      input "colorTemperatureDevicesOverride10", "capability.colorTemperature", title: "<b>Color temperature devices (CT mode)</b>", multiple:true
      input "warmCTOverride10", "number", title: "Warm White Temperature (default is 2500)"
      input "coldCTOverride10", "number", title: "Cold White Temperature (default is max of an individual light)"
    }
  }
}

def installed() {
  unsubscribe()
  unschedule()
  removeAllInUseGlobalVar()
  initialize()
}

def updated() {
  unsubscribe()
  unschedule()
  removeAllInUseGlobalVar()
  initialize()
}

def uninstalled() {
  unsubscribe()
  unschedule()
  removeAllInUseGlobalVar()
}

private logDescriptionText(debugText) {

  if (settings.logDescriptionText) {
    log.info "${app.name} (${app.getLabel()}): ${debugText}"
  }
}

private logEnhancedDescriptionText(debugText) {

  if (settings.logEnhancedDescriptionText) {
    log.info "${app.name} (${app.getLabel()}): ${debugText}"
  }
}

private logDebug(debugText) {

  if (settings.logDebug) {
    log.debug "${app.name} (${app.getLabel()}): ${debugText}"
  }
}

private def initialize() {
  logDebug("initialize() with settings: ${settings}")
  state.homekit = appList.find { it.name == "HomeKit Integration" && !it.user }


  subscribe(colorTemperatureDevices, "colorTemperature", eventHandler)
}

def eventHandler(Event evt) {
  logDebug("Processing event (${evt.name}, ${evt.value}) for ${evt.device.label}")
  def startDate = new Date(evt.date.getTime() - settings.waitTime)

  List<Event> eventsBetween = evt.device.eventsBetween(startDate, evt.date, [:])
  List<Event> eventList = eventsBetween.findAll() {
    it.name = 'command-setColorTemperature' && "APP-${state.homekit.id}" == it.producedBy
  }
  if (eventList.size() >= 1) {
    logDebug("Found event for homekit(${eventList.get(0).name}) for ${evt.device.label}")

    int oldCt = Integer.parseInt(evt.value)
    def newValues = getNewValues(oldCt, evt.device)

    if (newValues.colorTemp != oldCt) {
      pause(settings.waitTime)
      logDebug("Setting ${evt.device.label} Color Temperature: ${newValues.colorTemp} (old value ${evt.value})")
      evt.device.setColorTemperature(newValues.colorTemp)
    }
  } else {
    logDescriptionText("Skipping event (${evt.name}, ${evt.value}) for ${evt.device.label}:${eventsBetween.collect {it.getProperties()}}")
  }

}

def getOverrides(DeviceWrapper device, Map values) {
  if (settings.useCTOverrides) {
    if (settings.warmCTOverride != null && settings.warmCTOverride != "") {
      values.warmCT = settings.warmCTOverride
    }
    if (settings.coldCTOverride != null && settings.coldCTOverride != "") {
      values.coldCT = settings.coldCTOverride
    }
  }
  if (settings.useIndividualCTOverrides) {
    switch (device) {
      case colorTemperatureDevicesOverride1:
        if (settings.warmCTOverride1 != null && settings.warmCTOverride1 != "") {
          values.warmCT = settings.warmCTOverride1
        }
        if (settings.coldCTOverride1 != null && settings.coldCTOverride1 != "") {
          values.coldCT = settings.coldCTOverride1
        }
        break
      case colorTemperatureDevicesOverride2:
        if (settings.warmCTOverride2 != null && settings.warmCTOverride2 != "") {
          values.warmCT = settings.warmCTOverride2
        }
        if (settings.coldCTOverride2 != null && settings.coldCTOverride2 != "") {
          values.coldCT = settings.coldCTOverride2
        }
        break
      case colorTemperatureDevicesOverride3:
        if (settings.warmCTOverride3 != null && settings.warmCTOverride3 != "") {
          values.warmCT = settings.warmCTOverride3
        }
        if (settings.coldCTOverride3 != null && settings.coldCTOverride3 != "") {
          values.coldCT = settings.coldCTOverride3
        }
        break
      case colorTemperatureDevicesOverride4:
        if (settings.warmCTOverride4 != null && settings.warmCTOverride4 != "") {
          values.warmCT = settings.warmCTOverride4
        }
        if (settings.coldCTOverride4 != null && settings.coldCTOverride4 != "") {
          values.coldCT = settings.coldCTOverride4
        }
        break
      case colorTemperatureDevicesOverride5:
        if (settings.warmCTOverride5 != null && settings.warmCTOverride5 != "") {
          values.warmCT = settings.warmCTOverride5
        }
        if (settings.coldCTOverride5 != null && settings.coldCTOverride5 != "") {
          values.coldCT = settings.coldCTOverride5
        }
        break
      case colorTemperatureDevicesOverride6:
        if (settings.warmCTOverride6 != null && settings.warmCTOverride6 != "") {
          values.warmCT = settings.warmCTOverride6
        }
        if (settings.coldCTOverride6 != null && settings.coldCTOverride6 != "") {
          values.coldCT = settings.coldCTOverride6
        }
        break
      case colorTemperatureDevicesOverride7:
        if (settings.warmCTOverride7 != null && settings.warmCTOverride7 != "") {
          values.warmCT = settings.warmCTOverride7
        }
        if (settings.coldCTOverride7 != null && settings.coldCTOverride7 != "") {
          values.coldCT = settings.coldCTOverride7
        }
        break
      case colorTemperatureDevicesOverride8:
        if (settings.warmCTOverride8 != null && settings.warmCTOverride8 != "") {
          values.warmCT = settings.warmCTOverride8
        }
        if (settings.coldCTOverride8 != null && settings.coldCTOverride8 != "") {
          values.coldCT = settings.coldCTOverride8
        }
        break
      case colorTemperatureDevicesOverride9:
        if (settings.warmCTOverride9 != null && settings.warmCTOverride9 != "") {
          values.warmCT = settings.warmCTOverride9
        }
        if (settings.coldCTOverride9 != null && settings.coldCTOverride9 != "") {
          values.coldCT = settings.coldCTOverride9
        }
        break
      case colorTemperatureDevicesOverride10:
        if (settings.warmCTOverride10 != null && settings.warmCTOverride10 != "") {
          values.warmCT = settings.warmCTOverride10
        }
        if (settings.coldCTOverride10 != null && settings.coldCTOverride10 != "") {
          values.coldCT = settings.coldCTOverride10
        }
        break
      default:
        logDebug("No override for ${device.label}")
        break
    }
  }
  return values
}

def getNewValues(Integer oldCT, DeviceWrapper device) {
  def overrides = getOverrides(device, [warmCT: 2500, coldCT: 6535])
  int warmCT = overrides.warmCT as int
  int coldCT = overrides.coldCT as int

  def deviceCT = getDeviceJson(device.id).deviceState.ct
  int rangeCT = coldCT - warmCT
  int deviceCTRange = deviceCT.max - deviceCT.min
  int colorTemp = oldCT-((deviceCT.max-oldCT)*((deviceCTRange/rangeCT)-1))
  int upperOffset = Math.abs(deviceCT.max - coldCT)
  if (upperOffset > 0) {
    logDebug("Adding ${upperOffset} to final CT")
    colorTemp += upperOffset
  }
  return [colorTemp: Math.round(colorTemp)]
}

// No easy way to find device state variables other than this.
// Could be cached at set up so that we can use auth
// but would need updating if device changes
def getDeviceJson(String deviceId) {
  def result = [:]
  def params = [
          uri: getBaseUrl(),
          path: "/device/fullJson/${deviceId}",
          headers: [
                  Cookie: state.cookie
          ],
          ignoreSSLIssues: true
  ]

  try {
    httpGet(params) {
      result = it.data
    }

  } catch (e) {
    log.error "Error retrieving device info: ${e}"
  }

  return result
}

def getAppList() {
  def result = []
    def params = [
            uri: getBaseUrl(),
            path: "/hub2/appsList",
            headers: [
                    Cookie: state.cookie
            ],
            ignoreSSLIssues: true
    ]

    try {
      httpGet(params) { resp ->
        resp.data.apps.each { result += it.data }
      }

    } catch (e) {
      log.error "Error retrieving installed apps: ${e}"
    }

  return result
}

def getBaseUrl() {
  def scheme = sslEnabled ? "https" : "http"
  def port = sslEnabled ? "8443" : "8080"
  return "$scheme://127.0.0.1:$port"
}
