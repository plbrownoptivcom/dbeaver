/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2019 Serge Rider (serge@jkiss.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.tasks.ui.wizard;

import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
import org.jkiss.dbeaver.model.task.DBTTask;

class TaskWizardExecutor extends TaskProcessorUI {
    private static final Log log = Log.getLog(TaskWizardExecutor.class);

    public TaskWizardExecutor(@NotNull DBRRunnableContext staticContext, @NotNull DBTTask task) {
        super(staticContext, task);
    }

    @Override
    protected boolean isShowFinalMessage() {
        return false;//CommonUtils.getBoolean(getTask().getProperties().get("showFinalMessage"), super.isShowFinalMessage());
    }

    @Override
    protected void runTask() throws DBException {
//        DBTTaskHandler handlerTransfer = getTask().getType().createHandler();
//        handlerTransfer.executeTask(this, getTask(), Locale.getDefault(), log, this);
    }

}