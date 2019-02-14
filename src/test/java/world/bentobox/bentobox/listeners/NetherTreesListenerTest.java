package world.bentobox.bentobox.listeners;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;
import world.bentobox.bentobox.BentoBox;
import world.bentobox.bentobox.listeners.flags.NetherTreesListener;
import world.bentobox.bentobox.managers.IslandWorldManager;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Tests {@link world.bentobox.bentobox.listeners.flags.NetherTreesListener}.
 *
 * @author Poslovitch
 * @since 1.3.0
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({BentoBox.class})
public class NetherTreesListenerTest {

    /* Plugin */
    private BentoBox plugin;

    /* Island World Manager */
    private IslandWorldManager iwm;

    /* Listener */
    private NetherTreesListener listener;

    @Before
    public void setUp() {
        /* Plugin */
        plugin = mock(BentoBox.class);
        Whitebox.setInternalState(BentoBox.class, "instance", plugin);

        /* Island World Manager */
        iwm = mock(IslandWorldManager.class);
        when(plugin.getIWM()).thenReturn(iwm);

        /* Listener */
        listener = new NetherTreesListener(plugin);
    }
}
