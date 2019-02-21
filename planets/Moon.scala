//First i tought that the earth wouldn't need a satellite but it seems like humans aren't smart enough to find their way on the night since the deaths seems to increase by a deadly amount.
//Hacky implementation, it should be fixed as soon as possible.

import java.util.Calendar
import com.god.planets
var time = Calendar.getInstance().getTime()

object Moon extends Universe {
  if(time == night){
    MoonInit()
} else{
   ShutDownMoon()
   SunInit()
}
