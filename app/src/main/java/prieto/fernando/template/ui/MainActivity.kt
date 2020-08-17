package prieto.fernando.template.ui

import android.os.Bundle
import androidx.fragment.app.FragmentFactory
import androidx.navigation.Navigation
import dagger.android.support.DaggerAppCompatActivity
import prieto.fernando.template.R
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var fragmentFactory: FragmentFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.fragmentFactory = fragmentFactory
        setContentView(R.layout.activity_main)
    }

    override fun onSupportNavigateUp() =
        Navigation.findNavController(this, R.id.mainNavigationFragment).navigateUp()
}
