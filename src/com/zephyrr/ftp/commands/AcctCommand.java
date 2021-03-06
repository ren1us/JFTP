package com.zephyrr.ftp.commands;

import com.zephyrr.ftp.main.Session;

/*
 * Executor class for the Account command.
 * This command is not currently implemented.
 *
 * @author Peter Jablonski
 */

public class AcctCommand extends Command {
	public void execute(Session sess, String[] args) {
		// 502 Command not implemented
		sess.getControl().sendMessage(getCodeMsg(502));
	}
}
