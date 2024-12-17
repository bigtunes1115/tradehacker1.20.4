package org.litnhjacuzzi.tradehacker;

import net.fabricmc.api.ModInitializer;
import org.telegram.telegrambots.meta.exceptions.*;
import org.litnhjacuzzi.tradehacker.mixin.*;

public class TradeHacker implements ModInitializer 
{
	@Override
	public void onInitialize() {
		try {
			new MerchantHandleScreenMixin();
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}
}