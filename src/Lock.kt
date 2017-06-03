/**
 * Created by keyurgolani on 6/1/17.
 */
data class Lock<T: Any>(private val obj: T) {
    public fun acquire(func: (T) -> Unit) = synchronized (obj) {
        func(obj)
    }
}