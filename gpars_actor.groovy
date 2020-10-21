// GPars Actor
import static groovyx.gpars.actor.Actors.*

def decrypt = reactor { code -> code.reverse() }
def audit   = reactor { println it }

def main    = actor   {
    decrypt 'Terces Pot'
    react { plainText -> 
        audit plainText
    }
}
main.join()
audit.stop()
audit.join()