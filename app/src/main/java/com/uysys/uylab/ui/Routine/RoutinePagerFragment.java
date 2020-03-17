package com.uysys.uylab.ui.Routine;

import com.uysys.util.remote.model.classroutine.Datum;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.ItemRoutineBinding;
import com.uysys.uylab.ui.base.MyBaseFragment;

public class RoutinePagerFragment  extends MyBaseFragment {
private Datum datum;
private ItemRoutineBinding mBinding;
    public RoutinePagerFragment(Datum classRoutine) {
        this.datum=classRoutine;
    }

    @Override
    public int setLayoutId() {
        return R.layout.item_routine;
    }

    @Override
    public void startUI() {
        mBinding= (ItemRoutineBinding) getViewDataBinding();
        mBinding.txtCourseCode.setText(""+datum.getBatchId());
        mBinding.txtLabLocation.setText(""+datum.getLocation());
        mBinding.txtDate.setText(""+datum.getClassDays());

    }
}
