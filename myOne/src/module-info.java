import com.ths03.Impl.Czxy;
import com.ths03.Impl.Ths;
import com.ths03.MyService;

module myOne {
    exports com.ths01;
    exports com.ths02;
    exports com.ths03;

    provides MyService with Czxy;
}